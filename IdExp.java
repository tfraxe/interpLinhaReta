public class IdExp extends Exp {
    public String id;
    public IdExp(String i) {id = i;}

    IntAndTable interpExp(Table t) {
        int value = t.lookup(id);

        return new IntAndTable(value, t);
    }
}