package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultMethodForLongTest extends BaseTest {
    @Test
    public void longPositiveValuesMultTest(){
        long result = calculator.mult(2,3);
        Assert.assertEquals(result, 6, "Invalid Result of Mult Operation");
    }



    @Test
    public void longNegativeValuesMultTest(){
        long result = calculator.mult(-2,-3);
        Assert.assertEquals(result, 6, "Invalid Result of Mult Operation");

    }

    @Test
    public void longPositiveAndNegativeValuesMultTest(){
        long result = calculator.mult(2,-3);
        Assert.assertEquals(result, -6, "Invalid Result of Mult Operation");

    }
}
