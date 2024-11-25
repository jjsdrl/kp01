package day20231101;

import day20231020.A;

public class Animal {

    String name;

    public void makeSound(){
        System.out.println("动物会发出声音！！！");
    }

//    1、创建一个基类Animal，具有属性name和方法makeSound()。然后创建两个子类Dog和Cat，
//    它们分别重写makeSound()方法以发出不同的声音。在main方法中，创建Dog和Cat对象，并调用它们的makeSound()方法。
}
class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("狗会汪汪叫");
    }
}
class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("猫会喵喵叫");
    }
}
class TestAnimal{
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();
        Animal animal1 = new Cat();
        animal1.makeSound();
    }
}