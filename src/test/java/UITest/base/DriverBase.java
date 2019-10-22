package UITest.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * @author shidao.zhang
 */
public class DriverBase {
    public WebDriver driver;
    public DriverBase(String browser) {
        SelectDriver selectDriver = new SelectDriver();
        this.driver = selectDriver.driverName(browser);
    }

    public void stop() {
        System.out.println("Stop WebDriver");
        driver.close();
    }

    /**
     * 封装Element方法
     */
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    /**
     * 封装get方法
     */
    public void get(String url) {
        driver.get(url);
    }

    /**
     * 放大窗口
     */
    public void window() {
        driver.manage().window().maximize();
    }

    /**
     * 刷新页面
     */
    public void refresh() {
        driver.navigate().refresh();
    }

    /**
     * 获取文本内容
     */
    public String getText(WebElement element) {
        return element.getText();
    }

}
