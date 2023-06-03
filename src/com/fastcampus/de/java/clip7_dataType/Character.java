package com.fastcampus.de.java.clip7_dataType;

public class Character {
    public static void main(String[] args) {
        char alphabet = 'A';
        System.out.println(alphabet);

        Default defaults = new Default();
        System.out.println(defaults);
    }


    static class Default {
        char carDefault;
    }
}
