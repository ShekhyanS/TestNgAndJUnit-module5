package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DivMethodForDoubleValuesTest extends BaseTest {

    @Test
    public void doublePositiveValuesDivByZeroTest(){
        double result = calculator.div(2.0,0);
        System.out.println("doubleValuesDivTest");
        Assert.assertEquals(result, Double.POSITIVE_INFINITY, "Invalid Result of Div Operation");
    }

    @Test
    public void doubleNegativeValuesDivByZeroTest(){
        double result = calculator.div(-2.0,0);
        System.out.println("doubleValuesDivTest");
        Assert.assertEquals(result, Double.NEGATIVE_INFINITY, "Invalid Result of Div Operation");
    }

    @Test
    public void dubleValuesDivTest(){
        double result = calculator.div(3.4,2);
        Assert.assertEquals(result, 1.7, "Invalid Result of Div Operation");
    }

}