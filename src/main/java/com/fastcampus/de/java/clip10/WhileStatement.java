package com.fastcampus.de.java.clip10;

public class WhileStatement {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        while(i<10) {
            sum+=i+1;
            i++;
        }

        System.out.println("sum of 1-10" + sum);
    }
}
