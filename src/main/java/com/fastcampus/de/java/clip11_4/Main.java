package com.fastcampus.de.java.clip11_4;

public class Main {
    static class Animal {
        String name;

        Animal(String name) {
            this.name = name;
        }
        public void cry() {
            System.out.println(name + " is cring.");
        }
    }
    static class Dog extends Animal {
        String breed;

        // 부모클래스의 생성자에서 요구하는 파라미터를 자식클래스에서 반드시 채워줘야 한다.
        Dog(String name, String breed) {
            super(name); //부모클래스 생성자 호출, super은 부모클래스를 의미한다
            this.breed = breed; //자식클래스 매소드변수 채우기
        }

        public void swim() {
            System.out.println(name + " is swimming.");
        }

        public void bark() {
            System.out.println(name + "(" + breed + ")"+" is barking.");
        }
    }

    static class Giraffe extends Animal {
        Giraffe(String name) {
            super(name);
        }

        @Override
        public void cry() {
            System.out.println(name+" cannot cry.");
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog("소녀","골든리트리버");
        dog.cry();
        dog.swim();
        dog.bark();

        Animal animal = new Dog("코코","치와와"); //자식타입의 변수를 부모타입에 할당할 수 있다.
        animal.cry();
        //animal.swim() //부모타입에 변수는 자식클래스의 함수를 사용할 수 없다
    }

}
