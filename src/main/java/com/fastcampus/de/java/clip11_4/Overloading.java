package com.fastcampus.de.java.clip11_4;

public class Overloading {
    //이름이 같고, 파라미터의 개수 혹은 타입이 다르면 오버로딩이 적용된다.
    int add(int x, int y, int z) {
        System.out.println("int, int, int");
        return x+y+z;
    }
    long add(int a, int b, long c) {
        System.out.println("int, int, long");
        return a+b+c;
    }
    int add(int x, int y) {
        System.out.println("int, int");
        return x+y;
    }

    public static void main(String[] args) {
        Overloading ovl = new Overloading();

        System.out.println(ovl.add(1,2,3));
        System.out.println(ovl.add(1,2,12985723423L));
        System.out.println(ovl.add(1,2));

    }
}
