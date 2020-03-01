public class OpExp extends Exp {
    public Exp left, right;
    public int oper;

    final public static int Plus = 1, Minus = 2, Times = 3, Div = 4;

    public OpExp(Exp l, int o, Exp r) {
        left = l;
        right = r;
        oper =o;
    }

    IntAndTable interpExp(Table t) {
        IntAndTable it1 = left.interpExp(t);
        IntAndTable it2 = right.interpExp(it1.getTable());
        int newValue = 0;

        switch (oper) {
            case OpExp.Plus:
                newValue = it1.getValue() + it2.getValue();
                break;
            case OpExp.Minus:
                newValue = it1.getValue() - it2.getValue();
                break;
            case OpExp.Times:
                newValue = it1.getValue() * it2.getValue();
                break;
            case OpExp.Div:
                newValue = it1.getValue() / it2.getValue();
                break;
            default:
                System.out.println("Erro! Operador não definido");
                System.exit(2);
                break;
        }

        return new IntAndTable(newValue, it2.getTable());
    }
}