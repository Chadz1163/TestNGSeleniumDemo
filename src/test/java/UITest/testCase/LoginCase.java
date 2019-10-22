package UITest.testCase;

import UITest.base.DriverBase;
import UITest.business.LoginPro;
import UITest.utils.Constants;
import UITest.utils.ExcelUtility;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginCase extends CaseBase {
    public DriverBase driver;
    public LoginPro loginPro;

    public LoginCase() {
        this.driver = initDriver(Constants.BROWSER);
        loginPro = new LoginPro(driver);
    }

    @BeforeClass
    public void beforeClass() throws Exception {
        System.out.println("登录功能测试开始！");
        ExcelUtility.setExcelFile(Constants.EXCELFILEPATH, Constants.DEMO_SHEET);
        driver.get(Constants.URL);
        // 最大化窗口
        driver.window();
    }

    @DataProvider(name = "login")
    public Object[][] dataProvider() {
        // 获取Excel开始到结束标签中的数据
        return ExcelUtility.getTestData("demo");
    }

    @Test(dataProvider = "login")
    public void testLogin(String username, String password) throws InterruptedException {
        loginPro.process(username, password);
    }

    @AfterClass
    public void afterClass() {
        System.out.println("测试结束！");
        driver.stop();
        System.out.println("浏览器已关闭！");
    }

}
