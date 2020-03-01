public class AssignStm extends Stm {
    public String id; public Exp exp;

    public AssignStm(String i, Exp e) {id = i; exp = e;}

    Table interpStm(Table t) {
        return new Table(id, exp.interpExp(t).getValue(), t);
    }
}