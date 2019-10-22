package TestNG;

import org.testng.annotations.Factory;

/**
 * 工厂测试类
 */
public class TestFactory {

    @Factory
    public Object[] test() {
        Object[] object = new Object[2];
        for (int i = 0; i < 2; i++) {
            TestFactoryDemo tomandyFactory = new TestFactoryDemo(i + "");
            object[i] = tomandyFactory;
        }
        return object;
    }
}
