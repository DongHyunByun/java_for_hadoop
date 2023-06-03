package com.fastcampus.de.java.clip11_7_interFace;

public interface Bird {
    // interface에서의 변수는 static이다
    String STATIC_VARIABLE = "STATIC";

    void fly(int x, int y, int z);

    // default를 쓰면 기본 구현체를 구현하고 하위클래스에서 구현하지 않아도 된다.
    default void printBreed() {
        System.out.println("default print breed : "+ getBreed());
    }
    String getBreed();

    static void staticMethod() {
        System.out.println("This is static method");
    }

    // abstract도 쓸 수 있다.
    abstract void abstractMethod();
}
