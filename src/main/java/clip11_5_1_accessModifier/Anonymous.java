package com.fastcampus.de.java.clip11_5_1_accessModifier;

import com.fastcampus.de.java.clip11_5_accessModifier.AccessModifierTest;

public class Anonymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
//        accessModifierTest.messageDefault(); //defaul는 같은 패키지에서만 사용가능
//        accessModifierTest.messageInside(); //private는 같은 클래스에서만 사용 가능
//        accessModifierTest.messageProtected(); //protect는 같은 패키지나 상속받은 자식 클래스에서 사용 가능
        accessModifierTest.messageOutside();
    }
}
