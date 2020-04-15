package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultMethodForDoubleTest extends BaseTest {
    @Test
    public void doublePositiveValuesMultTest(){
        double result = calculator.mult(2.25,3.1);
        Assert.assertEquals(result, 6.0, "Invalid Result of Mult Operation");

    }

    @Test
    public void doubleNegativeValuesMultTest(){
        double result = calculator.mult(-2.25,-3.1);
        Assert.assertEquals(result, 6.0, "Invalid Result of Mult Operation");

    }

    @Test
    public void doublePositiveAndNegativeValuesMultTest(){
        double result = calculator.mult(-2.25,3.1);
        Assert.assertEquals(result, -7.0, "Invalid Result of Mult Operation");

    }
}
