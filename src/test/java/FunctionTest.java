import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class FunctionTest {

    Function function;

    @Before
    public void createObject() {
        function = new Function(10);
    }

    @Test
    public void functionResult() {
        Assert.assertEquals(97.48636634052538, Function.func(),0.5);
    }

    @Test
    public void xCheck(){
        boolean check = Function.getX() > 0;
        Assert.assertEquals(true, check);
    }
}