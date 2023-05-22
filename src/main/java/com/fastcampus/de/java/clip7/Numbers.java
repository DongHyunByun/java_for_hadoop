package com.fastcampus.de.java.clip7;

public class Numbers {
    public static void main(String[] args) {
        short s = 1; //2byte로 나타낼 수 있는 숫자
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);

        int a = 4; //4byte로 나타낼 수 있는 숫자

        long b = 1234567L; //8byte

        float c = 5.5F;

        double d = 9.123124235235D;


        System.out.println("========default========");
        Default defaults = new Default();
        System.out.println(defaults.intDefault);
        System.out.println(defaults.longDefault);
        System.out.println(defaults.floatDefault);
        System.out.println(defaults.doubleDefault);


    }

    static class Default {
        int intDefault;
        long longDefault;
        float floatDefault;
        double doubleDefault;
    }
}

