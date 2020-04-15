package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosMethodTest extends BaseTest {

    @Test
    public void cosCalculationTest(){
        double result = calculator.cos(45);
        Assert.assertEquals(result, 0.8509035245341184, "Invalid Result of Cos Operation");
    }

}
