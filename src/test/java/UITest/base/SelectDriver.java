package UITest.base;

import UITest.utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author shidao.zhang
 */
public class SelectDriver {
    public WebDriver driverName(String brower) {
        if (Constants.BROWSER.equalsIgnoreCase(brower)) {
            System.setProperty(Constants.DRIVER, Constants.DRIVERURL);
            return new ChromeDriver();
        } else {
            System.out.println("请选择chrome浏览器");
            return null;
        }
    }
}
