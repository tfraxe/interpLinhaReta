class Table {
    String id;
    int value;
    Table tail;

    Table(String i, int v, Table t) {
        id = i;
        value = v;
        tail = t;
    }

    int lookup(String key) {
        if (key == id) return value;
        if (tail == null) {System.out.println("Símbolo não encontrado"); System.exit(1);}

        return tail.lookup(key);
    }
}