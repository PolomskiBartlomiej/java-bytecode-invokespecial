package invoke.special;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by mtumilowicz on 2018-09-30.
 */
public class ParentTest {

    @Test
    public void locate() {
        assertThat(new Parent().locate(), is("In Parent"));
    }
}