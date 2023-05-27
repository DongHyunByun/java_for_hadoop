package com.fastcampus.de.java.clip11_6;

public abstract class Bird {
    private int x,y,z;

    void fly(int x, int y, int z) {
        System.out.println("이동");
        this.x = x;
        this.y = y;
        this.z = z;
        if (flyable(z))  {
            this.z = z;
        } else{
            System.out.println("그 높이로는날 수 없음");
        }

        printLocation();
    }

    public void printLocation() {
        System.out.println("현재 위치 :" + x + " " + y + " " + z);
    }

    abstract boolean flyable(int z); //abstract 함수, 상속받는 자식클래스에서 정의해야
}
