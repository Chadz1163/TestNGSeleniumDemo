package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SeleniumHandle {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        // 使用id获取元素，并输入
        driver.findElement(By.id("kw")).sendKeys("网易邮箱");
        String windowHandle = driver.getWindowHandle();
        // 使用xpath获取元素，并点击
        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
        // 强制等待，线程等待
        Thread.sleep(1000);
        // 使用linkText获取元素，并点击
        WebElement element = driver.findElement(By.linkText("163网易免费邮箱官方登录"));
        // 当你使用driver原生API如果发现报错，或者点击不了，或者出现其他异常，建议最好使用js的方式进行点击
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
        Thread.sleep(2000);
        // 切换窗口
        driver.switchTo().window(windowHandle);
        Thread.sleep(2000);
        // 清空输入框
        // 隐式等待
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        WebElement kw = driver.findElement(By.id("kw"));
        kw.clear();
    }
}
