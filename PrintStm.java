public class PrintStm extends Stm {
    public ExpList exps;
    public PrintStm(ExpList e) {exps = e;}

    Table interpStm(Table t) {
        Table t1 = print(exps, t);
        System.out.print('\n');
        return t1;
    }

    Table print(ExpList el, Table t) {
        if (el != null) {
            IntAndTable currentTable = el.getHead().interpExp(t);
            System.out.print(currentTable.getValue());
            System.out.print(" ");
            return print(el.getTail(), currentTable.getTable());
        }

        return t;
    }
}