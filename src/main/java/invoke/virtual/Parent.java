package invoke.virtual;

class Parent {

    String where() {
        return "In Parent";
    }

    String locate() {
        return where();
    }
}
