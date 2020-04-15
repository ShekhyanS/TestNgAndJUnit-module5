package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class SqrtMethodTest extends BaseTest{
    @Test
    public void positiveValueSqrtCalculationTest(){
        double result = calculator.sqrt(9.0);
        Assert.assertEquals(result, 3.0, "Invalid Result of Sqrt Operation");
    }

    @Test
    public void negativeValueSqrtCalculationTest(){
        double result = calculator.sqrt(-9);
        Assert.assertEquals(result, 3.0, "Invalid Result of Sqrt Operation");
    }


}
