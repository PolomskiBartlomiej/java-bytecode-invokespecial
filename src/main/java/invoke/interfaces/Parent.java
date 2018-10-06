package invoke.interfaces;

class Parent implements ParentFace {

    private String where() {
        return "In Parent";
    }

    @Override
    public String locate() {
       return where();
    }
}
