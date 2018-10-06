package invoke.interfaces;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ParentTest {

    @Test
    public void locate() {
        assertThat(new Parent().locate(), is("In Parent"));
    }

    @Test
    public void interface_locate() {
        ParentFace face = new Parent();
        assertThat(face.locate(), is("In Parent"));
    }
}