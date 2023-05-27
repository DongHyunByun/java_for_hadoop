package com.fastcampus.de.java.clip11_5;

public class AccessModifierTest {
    private void messageInside() {
        // private는 같은 클래스에서만 사용 가능
        System.out.println("This is private modifier");
    }

    void messageDefault() {
        // 같은 패키지에서만 사용 가능
        System.out.println("this is default(package-private modifier");
    }

    protected void messageProtected() {
        // 같은 패키지나 같은 패키지의 자손 클래스에서 사용 가지
        System.out.println("this is protected modifier");
    }

    public void messageOutside() {
        // 사용제한없음
        System.out.println("This is public modifier");
    }
}
