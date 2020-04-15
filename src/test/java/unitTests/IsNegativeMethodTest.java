package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeMethodTest extends BaseTest {
    @Test(groups = {"Regression"})
    public void isNegativeTestForPositiveValue(){
        boolean result = calculator.isNegative(9);
        Assert.assertFalse(result, "Invalid Result of IsNegative Operation");
    }

    @Test(groups = {"Smoke", "Regression"})
    public void isNegativeTestForNegativeValue(){
        boolean result = calculator.isNegative(-9);
        Assert.assertTrue(result,"Invalid Result of IsNegative Operation");
    }

    @Test(groups = {"Regression"})
    public void isNegativeTestForZeroValue(){
        boolean result = calculator.isNegative(0);
        Assert.assertFalse(result,"Invalid Result of IsNegative Operation");
    }
}
