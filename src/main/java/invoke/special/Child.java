package invoke.special;

/**
 * Created by mtumilowicz on 2018-09-30.
 */
class Child extends Parent {
    String where() {
        return "In Child";
    }

    @Override
    String who() {
        return "Child";
    }

    String superWho(){
       return super.who();
    }
}
