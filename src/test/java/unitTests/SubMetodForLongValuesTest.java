package unitTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubMetodForLongValuesTest extends BaseTest {

    @Test
    @Parameters({"subtractionValue"})
    public void longValuesSubtractionTest(String subtractionValue) {
        long result = calculator.sub(1, Long.parseLong(subtractionValue));
        Assert.assertEquals(result, -1, "Invalid Result of Sub Operation");
    }
}
