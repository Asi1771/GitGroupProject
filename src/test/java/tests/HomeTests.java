package tests;

import org.testng.annotations.Test;

public class HomeTests {

    @Test
    public void test1(){
        int a = 10;
        int b = 20;
        System.out.println(a+b);
    }

    @Test
    public void test2(){
        String city1 = "New York";
        String city2 = "Chicago";
        System.out.println(city1);
    }
}
