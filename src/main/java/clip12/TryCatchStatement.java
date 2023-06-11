package com.fastcampus.de.java.clip12;

import java.io.FileNotFoundException;

public class TryCatchStatement {
    public static void main(String[] args) {

        int number = 10;

        for (int i =10; i>=0; i--) {
            try {
                int result = number/i;
                System.out.println(result);
            } catch (Exception e) {
                // 모든 에러가 잡히는 부분
                System.out.println("exception occured"+e.getLocalizedMessage());
            } finally {
                // 무조건 실행되는 부분
                System.out.println("Always excuted");
            }
        }
    }
}
