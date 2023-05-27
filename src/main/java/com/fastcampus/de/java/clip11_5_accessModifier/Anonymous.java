package com.fastcampus.de.java.clip11_5_accessModifier;

public class Anonymous {
    public void call() {
        AccessModifierTest accessModifierTest = new AccessModifierTest();
        accessModifierTest.messageDefault();
//        accessModifierTest.messageInside(); //private는 같은 클래스에서만 사용 가능
        accessModifierTest.messageProtected();
        accessModifierTest.messageOutside();
    }

    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.call();
    }
}
