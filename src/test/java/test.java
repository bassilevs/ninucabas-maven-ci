import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by nino on 08.05.2016.
 */
public class test {

    @Test
    public void testBasil () {
        assert (true);
    }

    @Test
    public void testMock () {
        Force force = Mockito.mock(Force.class);
        force.awaken();
        Mockito.verify(force).awaken();
    }

}
