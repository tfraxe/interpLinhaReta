public class NumExp extends Exp {
    public int num;
    public NumExp(int n) {num = n;}

    IntAndTable interpExp(Table t) {
        return new IntAndTable(num, t);
    }
}