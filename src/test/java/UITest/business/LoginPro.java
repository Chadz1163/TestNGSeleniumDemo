package UITest.business;

import UITest.base.DriverBase;
import UITest.handle.LoginHandle;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class LoginPro {

    public DriverBase driver;
    public LoginHandle loginHandle;

    public LoginPro(DriverBase driver) {
        this.driver = driver;
        loginHandle = new LoginHandle(driver);
    }

    public void ImplicitWait(int i) {
        driver.driver.manage().timeouts().implicitlyWait(i, TimeUnit.SECONDS);
    }

    public void process(String username, String password) throws InterruptedException {
        ImplicitWait(5);
        // 输入username
        loginHandle.sendKeysUsername(username);
        // 输入password
        ImplicitWait(5);
        loginHandle.sendKeysPassword(password);
        // 点击登录
        ImplicitWait(5);
        loginHandle.clickLogin();
        Thread.sleep(5000);
        // 检查是否登录成功
        boolean isSuccess = loginHandle.checkLoginSuccess();
        Assert.assertTrue(isSuccess, "登录失败！");
    }


}
