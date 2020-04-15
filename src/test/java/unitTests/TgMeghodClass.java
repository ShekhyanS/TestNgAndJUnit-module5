package unitTests;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgMeghodClass extends BaseTest {
    @Test
    public void tbCalculationTest(){
        double result = calculator.tg(45);
        Assert.assertEquals(result, 1.0, "Invalid Result of Tg Operation");

    }
}
