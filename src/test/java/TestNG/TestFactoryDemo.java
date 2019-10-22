package TestNG;

import org.testng.annotations.Test;

/**
 * 测试类
 */
public class TestFactoryDemo {

    private String str;

    public TestFactoryDemo(String str) {
        this.str = str;
    }

    @Test
    public void test() {
        System.out.println("TestFactoryDemo: " + str);
    }

    @Test(dependsOnMethods = "test")
    public void test1() {
        System.out.println("TestFactoryDemo1: " + str);
    }
}
