package TestNG;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestGroup {
    @BeforeGroups("database")
    public void setupDB() {
        System.out.println("setupDB()");
    }

    @AfterGroups("database")
    public void cleanDB() {
        System.out.println("cleanDB()");
    }

    @Test(groups = "selenium-test")
    public void runSelenium() {
        System.out.println("runSelenium()");
    }

    @Test(groups = "selenium-test")
    public void runSelenium1() {
        System.out.println("runSelenium()1");
    }

    @Test(groups = "database")
    public void testConnectOracle() {
        System.out.println("testConnectOracle()");
    }
    /**
     * 测试方法也可以同时属于多个组
     */
    @Test(groups = {"mysql","database"})
    public void testConnectMsSQL() {
        System.out.println("testConnectMsSQL");
    }

    @Test(dependsOnGroups = { "database", "selenium-test" })
    public void runFinal() {
        System.out.println("runFinal");
    }

    @Test(dependsOnMethods = "runFinal")
    public void dependsOnMethods() {
        System.out.println("depend test:depend on runFinal");
    }

}
