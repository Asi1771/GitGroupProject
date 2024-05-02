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

    @Test
    public void homeTest3() {
        System.out.println("home test 3");
    }


    @Test
    public void homeTest4() {
        String city5 = "Bishkek";
        System.out.println("Bishkek is the best city" + city5);
    }

    @Test
    public void homeTest1() {
        String str = "HomeTest1 by Asi";
        System.out.println(str);
    }
    @Test
    public void homeTests7(){
        System.out.println("This is Benas test");
    }
    @Test
    public void homeTest5() {
        System.out.println("This is Mikas test");
    }
}
