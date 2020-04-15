package unitTests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgMethodTest extends BaseTest {

    @Test
    public void ctgCalculationTest(){
        double result = calculator.ctg(0.5);
        Assert.assertEquals(result, 0.46211715726000974, "Invalid Result of Ctg Operation");
    }
}
