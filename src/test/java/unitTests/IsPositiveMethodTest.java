package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveMethodTest extends BaseTest {
    @Test(groups ={"Smoke", "Regression"})
    public void isPositiveTestForPositiveValue(){
        boolean result = calculator.isPositive(9);
        Assert.assertTrue(result, "Invalid Result of IsPositive Operation");
    }

    @Test(groups = {"Regression"})
    public void isPositiveTestForNegativeValue(){
        boolean result = calculator.isPositive(-9);
        Assert.assertFalse(result,"Invalid Result of IsPositive Operation");
    }

    @Test(groups = {"Regression"})
    public void isPositisTestForZeroValue(){
        boolean result = calculator.isPositive(0);
        Assert.assertFalse(result,"Invalid Result of IsPositive Operation");
    }
}
