package com.fastcampus.de.java.clip11_1;

public class CalculationTest {
    static class Calculation {
        int ans;
        // 정적 매소드 : 인스턴스 없이도 사용할 수 있는 메소드 (class.func(param1,param2)
        // 맴버 변수는 사용할 수 없다
        static int add(int x, int y) {
            // return x+y+ans;
            return x+y;
        }

        int subtract(int x, int y) {
            return x-y;
        }
    }

    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        System.out.println("3 + 4 = "+calculation.add(3,4));
        System.out.println("4 + 7 = "+Calculation.add(4,7));
        System.out.println("10 - 4 = "+calculation.subtract(10,4));
    }
}
