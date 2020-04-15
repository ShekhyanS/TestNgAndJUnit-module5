package unitTests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubMetodForDoubleValuesTest extends BaseTest {
    @Test
     public void doubleValuesSubtractionTest(){
        Double result = calculator.sub(1.5, 2.44);
        Assert.assertEquals(result, -0.94, "Invalid Result of Sub Operation");
    }

}
