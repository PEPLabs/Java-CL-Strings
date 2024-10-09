import org.junit.Assert;
import org.junit.Test;

public class CombiningStringsTest {

    StringUtilities cs = new StringUtilities();

    /**
     * Tests the combine() method of the StringUtilities class.
     * 
     * This test verifies that, if combine() receives a value of `abc` and `xyz`, it returns `abcxyz`.
     */
    @Test
    public void combineTest1(){
        String input1 = "abc";
        String input2 = "xyz";
        String expected = "abcxyz";
        String actual = cs.combine(input1, input2);
        Assert.assertEquals(expected,actual);
    }

    /**
     * Tests the combine() method of the StringUtilities class.
     * 
     * This test verifies that, if combine() receives a value of `123` and `456`, it returns `123456`.
     */
    @Test
    public void combineTest2(){
        String input1 = "123"; 
        String input2 = "456";
        String expected = "123456";
        String actual = cs.combine(input1, input2);
        Assert.assertEquals(expected,actual);
    }
}
