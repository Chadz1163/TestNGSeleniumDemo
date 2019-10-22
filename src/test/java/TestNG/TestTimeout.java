package TestNG;

import org.testng.annotations.Test;

/**
 * 超时测试
 */
public class TestTimeout {

    @Test(timeOut = 500)
    public void testPass() throws InterruptedException {
        Thread.sleep(400);
    }
    @Test(timeOut = 500)
    public void testFail() throws InterruptedException {
        Thread.sleep(600);
    }
}
