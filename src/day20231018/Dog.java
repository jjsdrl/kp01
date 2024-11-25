package day20231018;

public class Dog extends Animal{
//    String name;
    public void eat(){
        System.out.println("WangQiao会吃shi");
    }
}
class Cat extends Animal{
//    String name;
//    public void eat(){
//        System.out.println("动物会吃东西");
//    }
}
class Animal{
    String name;
    public void eat(){
        System.out.println("动物会吃东西");
    }
}

class TestAnimal{
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();
        Dog dog = new Dog();
        dog.eat();
        Animal animal = new Animal();

    }
}