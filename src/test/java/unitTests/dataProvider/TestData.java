package unitTests.dataProvider;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "Long Type Inputs")
    public Object[][] getLongTypeData() {
        return new Object[][]{
                {1, 2, 3},
                {1, -5, -4},
                {-9, 0, -9},
                {-5, 1, -4},
                {0, 2, 2},
                {-7, -10, -17},
                {9223372036854775807L, -9223372036854775808L, -1}
        };
    }

    @DataProvider(name = "Double Type Inputs")
    public Object[][] getDoubleTypeData() {
        return new Object[][]{
                {1.25, 5.47, 6.72},
                {-1.25, 5.47, 4.22},
                {5.47, 1, 6.47},
                {2.48, -5.46, -2.98},
                {-7.11, -10.15, -17.26},
                {5.47, 0.00, 5.47}
        };

    }

}
