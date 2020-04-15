package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivMethodForLongValuesTest extends BaseTest {

    @Test(expectedExceptions = {ArithmeticException.class}, expectedExceptionsMessageRegExp = "Attempt to divide by zero")
    public void longValuesDivByZeroTest(){
        long result = calculator.div(2,0);
    }

    @Test
    public void longValuesDivTest(){
        long result = calculator.div(3,2);
        Assert.assertEquals(result, 1, "Invalid Result of Div Operation");
    }
}