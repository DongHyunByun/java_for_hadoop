package com.fastcampus.de.java.clip11_7;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1,2,3);

        bird.printBreed();
        // bird.printLocation(); //인터페이스에 정의된 함수만 사용할 수 있따.
    }
}
