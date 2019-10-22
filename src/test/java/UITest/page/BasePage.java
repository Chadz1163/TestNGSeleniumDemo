package UITest.page;

import UITest.base.DriverBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * @author shidao.zhang
 */
public class BasePage {

    public DriverBase driver;

    public BasePage(DriverBase driver) {
        this.driver = driver;
    }

    /**
     * 定位Element
     *
     * @param by
     * @return
     */
    public WebElement element(By by) {
        WebElement element = driver.findElement(by);
        return element;
    }

    /**
     * 封装点击
     *
     * @param element 点击的元素
     */
    public void click(WebElement element) {
        if (element != null) {
            element.click();
        } else {
            System.out.println("元素没有定位到，点击失败");
        }
    }

    /**
     * 封装输入
     *
     * @param element 输入值的元素
     * @param value 输入的值
     */
    public void sendKeys(WebElement element, String value) {
        if (element != null) {
            if (element.getText() != null){
                element.clear();
            }
            element.sendKeys(value);
        } else {
            System.out.println("元素没有定位到, 输入失败, 输入内容：" + value);
        }
    }

    /**
     * 判断元素是否显示
     *
     * @param element 元素
     * @return 是否在页面显示
     */
    public boolean assertElementIs(WebElement element) {
        return element.isDisplayed();
    }

    /**
     * 封装获取元素文本内容
     */
    public String getText(WebElement element) {
        return element.getText();
    }
}
