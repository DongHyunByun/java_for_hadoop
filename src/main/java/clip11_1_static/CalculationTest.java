package com.fastcampus.de.java.clip11_1_static;

public class CalculationTest {
    int ans = 4;
    static String name = "calculater";

    //static 함수
    static int add(int x, int y) {
        // return x+y+ans; //맴버변수는 사용할 수 없다.
        return x+y;
    }

    //맴버함수
    int subtractFour(int x, int y) {
        return x-y-this.ans;
    }


    public static void main(String[] args) {
        //
        CalculationTest calculation = new CalculationTest();
        System.out.println("3 + 4 = "+calculation.add(3,4));
        System.out.println("10 - 4 - 4= "+calculation.subtractFour(10,4));

        //
        System.out.println("4 + 7 = "+CalculationTest.add(4,7));
        System.out.println(CalculationTest.name);
    }
}
