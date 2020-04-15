package unitTests;

import com.epam.tat.module4.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class JUnitTestExample {

    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }
    @AfterEach
    public void cleanUp() {
        calculator = null;
    }

    @Test
    @RepeatedTest(10)
     public void longValuesSubtractionTest() {
        long result = calculator.sub(1, 2);
        Assert.assertEquals(-1,result);
    }

    @Test
    public void longValuesDivByZeroTest(){

        Assertions.assertThrows(ArithmeticException.class, ()-> {calculator.div(2, 0);});
    }


}
