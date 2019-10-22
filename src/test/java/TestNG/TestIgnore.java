package TestNG;

import org.testng.annotations.Test;

/**
 * 忽略测试
 */
public class TestIgnore {
    @Test // 默认就是 enabled = true
    public void test1() {
        System.out.println("this is test1!");
    }

    @Test(enabled = false)
    public void test2() {
        System.out.println("this is test2!");
    }

    @Test(enabled = true)
    public void test3() {
        System.out.println("this is test3!");
    }
}
