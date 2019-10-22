package UITest.page;

import UITest.base.DriverBase;
import UITest.utils.GetByLocator;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取username元素
     * @return
     */
    public WebElement getUsername() {
        return element(GetByLocator.getLocator("username"));
    }

    /**
     * 获取password元素
     * @return
     */
    public WebElement getPassword() {
        return element(GetByLocator.getLocator("password"));
    }

    /**
     * 获取登录按钮元素
     * @return
     */
    public WebElement getLogin() {
        return element(GetByLocator.getLocator("loginButton"));
    }

}
