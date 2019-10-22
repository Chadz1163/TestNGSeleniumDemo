package UITest.page;

import UITest.base.DriverBase;
import UITest.utils.GetByLocator;
import org.openqa.selenium.WebElement;

public class SidebarPage extends BasePage {
    public SidebarPage(DriverBase driver) {
        super(driver);
    }

    /**
     * 获取logo元素
     * @return
     */
    public WebElement getLogo() {
        return element(GetByLocator.getLocator("logo"));
    }
}
