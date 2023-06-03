package com.fastcampus.de.java.clip11_7_interFace;

public class Pigeon implements Bird{
    private int x,y,z;

    @Override
    public void fly(int x, int y, int z) {
        System.out.println("날아갑니다");
        this.x = x;
        this.y = y;
        this.z = z;

        printLocation();
    }

    @Override
    public String getBreed() {
        return "비둘기";
    }

    @Override
    public void abstractMethod() {
        System.out.println("this is abstract method implemented from Pigeon");
    }

    public void printLocation() {
        System.out.println("현재위치 "+x+y+z);
    }
}
