package day20231120;

public class TestInterfaceGeneric {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.compareTo(new Dog());
    }

}
//class Dog implements Comparable{
//
//    @Override
//    public int compareTo(Object o) {
//        return 0;
//    }
//}

class Cat{

}


class Dog implements Comparable<Dog>{
    @Override
    public int compareTo(Dog o) {
        return 0;
    }
}