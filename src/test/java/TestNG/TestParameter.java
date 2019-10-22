package TestNG;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化、多线程
 */
public class TestParameter {

    /**
     * xml
     * @param username
     * @param password
     */
    @Test
    @Parameters({"username", "password"})
    public void testParameter(String username, String password) {
        System.out.println(username + ":" + password);
    }

    /**
     * dataProvider
     * @return
     */
    @DataProvider(name = "provideNumbers")
    public Object[][] provideData() {

        return new Object[][] { { 10, 20 }, { 100, 110 }, { 200, 210 } };
    }
    //多线程，3个线程同时运行，共执行10次
    @Test(dataProvider = "provideNumbers",invocationCount = 10,threadPoolSize = 3)
    public void test(int number, int expected) {
        Assert.assertEquals(number + 10, expected);
    }


}
