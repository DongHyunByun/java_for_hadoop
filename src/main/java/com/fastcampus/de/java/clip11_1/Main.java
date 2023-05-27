package com.fastcampus.de.java.clip11_1;

import java.sql.SQLOutput;

public class Main {
    static class Person {
        String name;
        String country;
        int age;

        Person(String name, String country, int age) {
            this.name = name;
            this.country = country;
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Person minsoo =  new Person("민수","대한민국",10);
        minsoo.name = "정수";
        minsoo.country = "중국";
        minsoo.age = 20;

        Person paul = new Person("jake","English",30);
        paul.name = "Paul";
        paul.country = "America";
        paul.age = 40;

        Person[] persons = {minsoo, paul};

        for (Person cur : persons) {
            System.out.println("<자기소개>");
            System.out.println("hi my name is "+cur.name+" nice to meet you");
            System.out.println("i born in "+cur.country+"!!");
            System.out.println("i am "+cur.age+" years old");
        }
    }
}
