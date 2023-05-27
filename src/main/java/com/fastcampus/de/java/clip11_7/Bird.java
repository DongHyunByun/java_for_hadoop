package com.fastcampus.de.java.clip11_7;

public interface Bird {
    void fly(int x, int y, int z);

    // default를 쓰면 기본 구현체를 구현하고 하위클래스에서 구현하지 않아도 된다.
    default void printBreed() {
        System.out.println("default print breed : "+ getBreed());
    }
    String getBreed();
}
