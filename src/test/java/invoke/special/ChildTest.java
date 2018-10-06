package invoke.special;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mtumilowicz on 2018-09-30.
 */
public class ChildTest {

    @Test
    public void where() {
        assertThat(new Child().where(), is("In Child"));
    }

    @Test
    public void locate() {
        assertThat(new Child().locate(), is("In Parent"));
    }

    @Test
    public void locate_asParent() {
        Parent asParent = new Child();
        assertThat(asParent.locate(), is("In Parent"));
    }

    @Test
    public void who() {
        Child child = new Child();
        assertThat(child.who(), is("Child"));
    }


    @Test
    public void superWho() {
        Child child = new Child();
        assertThat(child.superWho(), is("Parent"));
    }

}