public class EseqExp extends Exp {
    public Stm stm; 
    public Exp exp;

    public EseqExp(Stm s, Exp e) {stm = s; exp = e;}

    IntAndTable interpExp(Table t) {
        Table t1 = stm.interpStm(t);
        return exp.interpExp(t1);
    }
}