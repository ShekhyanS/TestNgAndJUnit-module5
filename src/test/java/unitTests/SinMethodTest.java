package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SinMethodTest extends BaseTest {
    @Test
    public void sinCalculationTest(){
        double result = calculator.sin(45);
        Assert.assertEquals(result, 0.8509035245341184, "Invalid Result of Sin Operation");
    }
}
