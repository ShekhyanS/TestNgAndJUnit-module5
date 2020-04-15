package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PowMethodTest extends BaseTest {
    @Test
    public void powCalculationTest(){
        double result = calculator.pow(4,0.5);
        Assert.assertEquals(result, 1.0, "Invalid Result of Pow Operation");
    }

    @Test
    public void negativePowCalculationTest(){
        double result = calculator.pow(4.0,-1);
        Assert.assertEquals(result, 0.25, "Invalid Result of Pow Operation");
    }

}
