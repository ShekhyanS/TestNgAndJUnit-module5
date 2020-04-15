package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import unitTests.dataProvider.TestData;

public class SumMethodForDoubleValuesTest extends BaseTest{

    @Test(dataProviderClass = TestData.class, dataProvider = "Double Type Inputs")
    public void doubleValuesSumTest(double input1, double input2, double sum) {
        double result = calculator.sum(input1, input2);
        Assert.assertEquals(result, sum, "Invalid Result of Sum Operation");
    }
}
