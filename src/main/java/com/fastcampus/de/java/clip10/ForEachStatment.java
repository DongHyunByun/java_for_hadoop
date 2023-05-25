package com.fastcampus.de.java.clip10;

public class ForEachStatment {
    public static void main(String[] args) {
        String[] days = {"Monday", "Thuesday", "Wednesday"};

        System.out.println("for each 문");
        for (String day : days) {
            System.out.println(day);
        }

        System.out.println("index를 이용한 for문");
        for (int i=0; i<days.length; i++) {
            System.out.println(days[i]);
        }
    }
}
