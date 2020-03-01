public class LastExpList extends ExpList {
    public Exp head;
    public LastExpList(Exp h) {head = h;}

    Exp getHead() {return head;}
    ExpList getTail() {return null;}
}