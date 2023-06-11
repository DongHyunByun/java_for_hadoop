package com.fastcampus.de.java.clip13;


import java.util.Date;

public class DateExample {
    public static void main(String[] args) {
        System.out.println("----현재----");
        System.out.println(new Date()); //Date함수의 default

        System.out.println("----10000 밀리sec 지남----");
        int n=1000;
        System.out.println(new Date(n)); //1970년 1월1일부터 (n)ms 지난 값을 확인한다

        System.out.println("과거이면? : " + new Date().compareTo(new Date(1)));
        System.out.println(new Date().after(new Date(1)));
        System.out.println(new Date(1));


        long future = 222342352342346L;
        System.out.println("미래이면? : " + new Date().compareTo(new Date(future)));
        System.out.println(new Date().after(new Date(future)));
        System.out.println(new Date(future));
    }
}
