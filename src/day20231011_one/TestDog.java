package day20231011_one;

import day20231011.Dog;

public class TestDog {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        System.out.println(dog.dogName);//private 只能在同一个类中才能访问
//        System.out.println(dog.dogAge);//默认的   同一个包中不同类能访问 同一个类中能访问
//        System.out.println(dog.dogColor);//protected 同一个包中不同类能访问 同一个类中能访问 不同包中的不同类，但有两个类有子父类继承关系能够访问
        System.out.println(dog.dogType);


    }
}
