package TestNG;

import org.testng.annotations.Test;

public class MultiThreadedByXml {
    @Test
    public void test1() {
        System.out.println("Thread id is " + Thread.currentThread().getId());
    }

    @Test
    public void test2() {
        System.out.println("Thread id is " + Thread.currentThread().getId());
    }

    @Test
    public void test3() {

        System.out.println("Thread id is " + Thread.currentThread().getId());

    }

    @Test
    public void test4() {
        System.out.println("Thread id is " + Thread.currentThread().getId());
    }

    @Test
    public void test5() {
        System.out.println("Thread id is " + Thread.currentThread().getId());
    }
}
