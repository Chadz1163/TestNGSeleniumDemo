package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * 八种元素定位方式
 */
public class SeleniumElement {

    public static void main(String[] args) {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.baidu.com");

        // 通过id获取元素
        WebElement su = driver.findElement(By.id("su"));
        String text = su.getAttribute("value");
        System.out.println("通过id获取元素：" + text);

        // 通过tagName获取元素
        List<WebElement> input = driver.findElements(By.tagName("input"));
        String text7 = input.get(0).getAttribute("value");
        System.out.println("通过tagName获取元素：" + text7);

        // 通过xpath获取元素
        WebElement element = driver.findElement(By.xpath("//*[text()='hao123']"));
        String text1 = element.getText();
        System.out.println("通过xpath获取元素：" + text1);

        // 通过name获取元素
        WebElement tj_briicon = driver.findElement(By.name("tj_briicon"));
        String text2 = tj_briicon.getText();
        System.out.println("通过name获取元素：" + text2);

        // 通过链接部分内容获取元素
        WebElement element1 = driver.findElement(By.partialLinkText("123"));
        String text3 = element1.getText();
        System.out.println("通过链接部分内容获取元素：" + text3);

        // 通过linkText获取元素
        WebElement tieba = driver.findElement(By.linkText("贴吧"));
        String text4 = tieba.getText();
        System.out.println("通过linkText获取元素：" + text4);

        // 通过css获取元素
        WebElement element2 = driver.findElement(By.cssSelector("#su"));
        String text5 = element2.getAttribute("value");
        System.out.println("通过css获取元素：" + text5);

        // 通过className获取元素
        List<WebElement> elements = driver.findElements(By.className("mnav"));
        for (WebElement webElement : elements) {
            String text6 = webElement.getText();
            System.out.println("通过className获取元素：" + text6);
        }
    }
}
