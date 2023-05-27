package com.fastcampus.de.java.clip11_5_1_accessModifier;

import com.fastcampus.de.java.clip11_5_accessModifier.AccessModifierTest;

public class Child extends AccessModifierTest {
    public void call() {
//        this.messageDefault(); //defaul는 같은 패키지에서만 사용가능
//        this.messageInside(); //private는 같은 클래스에서만 사용 가능
        this.messageProtected(); //protect는 같은 패키지나 상속받은 자식 클래스에서 사용 가능
        this.messageOutside();
    }

    public static void main(String[] args) {
        Child chd = new Child();
        chd.call();
    }
}


