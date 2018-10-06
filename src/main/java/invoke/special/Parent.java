package invoke.special;

/**
 * Created by mtumilowicz on 2018-09-30.
 */
class Parent {
    private String where() {
        return "In Parent";
    }

    String who() {
        return "Parent";
    }


    String locate() {
        return where();
    }
}
