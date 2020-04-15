package unitTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import unitTests.dataProvider.TestData;

public class SumMethodForLongValuesTest extends BaseTest{


    @Test(dataProviderClass = TestData.class, dataProvider = "Long Type Inputs")
    public void longValuesSumTest(long input1, long input2, long sum){
        long result = calculator.sum(input1,input2);
        Assert.assertEquals(result, sum, "Invalid Result of Sum Operation");
        System.out.println("longValuesSumTest");
    }


}
