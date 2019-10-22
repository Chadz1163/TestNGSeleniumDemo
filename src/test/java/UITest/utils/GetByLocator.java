package UITest.utils;

import org.openqa.selenium.By;

/**
 * @author 77932
 */
public class GetByLocator {
    public static By getLocator(String key) {
        ProUtil pro = new ProUtil("element.properties");
        String locator = pro.getPro(key);
        String locatorType = locator.split(">")[0];
        String locatorValue = locator.split(">")[1];
        String id = "id";
        String name = "name";
        String className = "className";
        if (id.equals(locatorType)){
            return By.id(locatorValue);
        } else if (name.equals(locatorType)) {
            return By.name(locatorValue);
        } else if (className.equals(locatorType)) {
            return By.className(locatorValue);
        } else {
            return By.xpath(locatorValue);
        }
    }
}
