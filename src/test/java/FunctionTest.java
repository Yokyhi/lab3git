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

    @Test
    public void xCheckWrong(){
        boolean check = Function.getX() < 0;
        Assert.assertNotEquals(true, check);
    }

    @Test
    public void xMaxLess(){
        boolean check = Function.getX() < 2147483647;
        Assert.assertEquals(true, check);
    }

    @Test
    public void xNotNull(){
        boolean check = Function.getX() != 0;
        Assert.assertEquals(true, check);
    }

    @Test
    public void xMaxMore(){
        boolean check = Function.getX() > -2147483647;
        Assert.assertEquals(true, check);
    }

    @Test
    public void functionCheckWrongResult(){
        Assert.assertNotEquals(100, Function.func(),0.5);
    }

    @Test
    public void xCheckNotEqResult(){
        boolean check = Function.getX() == 0;
        Assert.assertNotEquals(true, check);
    }

    @Test
    public void xLess(){
        boolean check = Function.getX() < 123456;
        Assert.assertEquals(true, check);
    }
}