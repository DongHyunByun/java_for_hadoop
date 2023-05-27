package com.fastcampus.de.java.clip11_6_abstract;

public class Pigeon extends Bird {
    @Override
    boolean flyable(int z) {
        return z<10000;
    }

    public static void main(String[] args) {
        Bird pigeon = new Pigeon();

        System.out.println("비둘기");
        pigeon.fly(1,2,3);

    }

}

