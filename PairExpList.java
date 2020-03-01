public class PairExpList extends ExpList {
    public Exp head; 
    public ExpList tail;
    public PairExpList(Exp h, ExpList t) {
        head = h;
        tail = t;
    }

    Exp getHead() {return head;}
    ExpList getTail() {return tail;}
}