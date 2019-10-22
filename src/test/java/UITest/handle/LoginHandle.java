package UITest.handle;

import UITest.base.DriverBase;
import UITest.page.LoginPage;
import UITest.page.SidebarPage;
import org.openqa.selenium.WebElement;

public class LoginHandle {
    public DriverBase driver;
    public LoginPage loginPage;
    public SidebarPage sidebarPage;

    public LoginHandle(DriverBase driver) {
        this.driver = driver;
        loginPage = new LoginPage(driver);
    }

    /**
     * 输入username
     */
    public void sendKeysUsername(String username) {
        loginPage.sendKeys(loginPage.getUsername(), username);
    }

    /**
     * 输入password
     */
    public void sendKeysPassword(String password) {
        loginPage.sendKeys(loginPage.getPassword(), password);
    }

    /**
     * 点击登录
     */
    public void clickLogin() {
        loginPage.getLogin().click();
    }

    /**
     * 检查是否登录成功
     *
     * @return
     */
    public boolean checkLoginSuccess() {
        try {
            WebElement logo = sidebarPage.getLogo();
            String text = logo.getText();
            if ("octopus-NG ".equals(text)) {
                return true;
            } else {
                return false;
            }
        } catch (NullPointerException e) {
            return false;
        }
    }


}
