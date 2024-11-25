package day20231011;

public class TestDogOne {
    public static void main(String[] args) {
        Dog dog = new Dog();
//        System.out.println(dog.dogName);//private 只能在同一个类中才能访问
        System.out.println(dog.dogAge);
        System.out.println(dog.dogColor);
        System.out.println(dog.dogType);

    }
}
