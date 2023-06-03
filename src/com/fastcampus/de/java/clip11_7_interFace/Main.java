package com.fastcampus.de.java.clip11_7_interFace;

public class  Main {
    public static String STATIC_VARIABLE = "MAIN_STATIC";

    public static void main(String[] args) {
        Bird bird = new Pigeon();
        bird.fly(1,2,3);

        bird.printBreed();
        // bird.printLocation(); //인터페이스에 정의된 함수만 사용할 수 있따.
        bird.abstractMethod();
        Bird.staticMethod();
        System.out.println(Bird.STATIC_VARIABLE);
        System.out.println(STATIC_VARIABLE);


    }
}
