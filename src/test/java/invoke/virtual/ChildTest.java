package invoke.virtual;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ChildTest {

    @Test
    public void where() {
        assertThat(new Child().where(), is("In Child"));
    }

    @Test
    public void locate() {
        assertThat(new Child().locate(), is("In Child"));
    }

    @Test
    public void locate_asParent() {
        Parent asParent = new Child();
        assertThat(asParent.locate(), is("In Child"));
    }
}