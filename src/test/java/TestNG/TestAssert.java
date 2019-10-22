package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 * 断言演示
 */
public class TestAssert {

    /**
     * 测试硬断言
     * (1) assertTrue：判断是否为True。
     * (2) assertFalse：判断是否为false。
     * (3) assertSame：判断引用地址是否相同。
     * (4) assertNotSame：判断引用地址是否不相同。
     * (5) assertNull：判断是否为null。
     * (6) assertNotNull：判断是否不为null。
     * (7) assertEquals：判断是否相等，Object类型的对象需要实现haseCode及equals方法。
     * (8) assertNotEquals：判断是否不相等。
     * (9) assertEqualsNoOrder：判断忽略顺序是否相等
     */
    @Test
    public void testAssertTrue() {
        boolean boo = false;
        Assert.assertTrue(boo, "输入的Boolean值为false");
        System.out.println("此为断言后输出");
    }

    @Test
    public void testAssertFalse() {
        boolean boo = true;
        Assert.assertFalse(boo, "输入的Boolean值为True");
        System.out.println("此为断言后输出");
    }

    @Test
    public void testAssertSame() {
        String a = "我是a";
        String b = "我是b";
        Assert.assertSame(b, a, "两个对象引用的不是同一个对象");
        System.out.println("此为断言后输出");
    }

    @Test
    public void testAssertNotSame() {
        String a = "我是a";
        String b = "我是b";
        Assert.assertNotSame(a, b, "两个对象引用的是同一个对象");
        System.out.println("此为断言后输出");
    }

    @Test
    public void testAssertNull() {
        String a = null;
        Assert.assertNull(a, "输入不为Null");
        System.out.println("此为断言后输出");
    }

    @Test
    public void testAssertNotNull() {
        String a = null;
        Assert.assertNotNull(a, "输入为Null");
        System.out.println("此为断言后输出");
    }

    @Test
    public void testAssertEquals() {
        int a = 1;
        int b = 2;
        Assert.assertEquals(a, b, "输入的值不等");
        System.out.println("此为断言后输出");
    }

    @Test
    public void testAssertNotEquals() {
        int a = 1;
        int b = 2;
        Assert.assertNotEquals(a, b, "输入的值相等");
        System.out.println("此为断言后输出");
    }

    /**
     * 断言两个数组包含相同元素，并且忽略数组元素的排列顺序
     */
    @Test
    public void testAssertEqualsNoOrder() {
        String[] a = {"a","b","c"};
        String[] b = {"c","a","b"};
        Assert.assertEqualsNoOrder(a, b,"两个数组的值不等");
        System.out.println("此为断言后输出");
    }

    /**
     * 测试软断言
     * (1) assertTrue：判断是否为True。
     * (2) assertFalse：判断是否为false。
     * (3) assertSame：判断引用地址是否相同。
     * (4) assertNotSame：判断引用地址是否不相同。
     * (5) assertNull：判断是否为null。
     * (6) assertNotNull：判断是否不为null。
     * (7) assertEquals：判断是否相等，Object类型的对象需要实现haseCode及equals方法。
     * (8) assertNotEquals：判断是否不相等。
     * (9) assertEqualsNoOrder：判断忽略顺序是否相等
     */
    @Test
    public void softTestAssertTrue() {
        boolean boo = false;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(boo, "输入的Boolean值为false");
        System.out.println("此为断言后输出");
        softAssert.assertAll();
    }

    @Test
    public void softTestAssertFalse() {
        boolean boo = true;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertFalse(boo, "输入的Boolean值为True");
        System.out.println("此为断言后输出");
        softAssert.assertAll();
    }

    @Test
    public void softTestAssertSame() {
        String a = "我是a";
        String b = "我是b";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertSame(b, a, "两个对象引用的不是同一个对象");
        System.out.println("此为断言后输出");
        softAssert.assertAll();
    }

    @Test
    public void softTestAssertNotSame() {
        String a = "我是a";
        String b = "我是b";
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotSame(a, b, "两个对象引用的是同一个对象");
        System.out.println("此为断言后输出");
        softAssert.assertAll();
    }

    @Test
    public void softTestAssertNull() {
        String a = null;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNull(a, "输入不为Null");
        System.out.println("此为断言后输出");
        softAssert.assertAll();
    }

    @Test
    public void softTestAssertNotNull() {
        String a = null;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotNull(a, "输入为Null");
        System.out.println("此为断言后输出");
        softAssert.assertAll();
    }

    @Test
    public void softTestAssertEquals() {
        int a = 1;
        int b = 2;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(a, b, "输入的值不等");
        System.out.println("此为断言后输出");
        softAssert.assertAll();
    }

    @Test
    public void softTestAssertNotEquals() {
        int a = 2;
        int b = 2;
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertNotEquals(a, b, "输入的值相等");
        System.out.println("此为断言后输出");
    }

    /**
     * 断言两个数组包含相同元素，并且忽略数组元素的排列顺序
     */
    @Test
    public void softTestAssertEqualsNoOrder() {
        String[] a = {"a","b","c"};
        String[] b = {"c","a","b"};
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEqualsNoOrder(a, b,"两个数组的值不等");
        System.out.println("此为断言后输出");
    }
}
