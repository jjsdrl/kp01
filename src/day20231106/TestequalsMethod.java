package day20231106;

import java.util.Objects;

public class TestequalsMethod {
    public static void main(String[] args) {
//        int numOne = 100;
//        int numTwo = 100;
////        基本数据类型不能用equals方法进行比较，只能用==去进行比较
////        System.out.println(numOne.equals(numTwo));
//        System.out.println(numOne == numTwo);

        //Object中的equals方法比较的方式和==一样，比较两个对象在内存中的地址是否一样
        Animal animalOne = new Animal("旺财");
        Animal animalTwo = new Animal("黑鬼");
//        System.out.println(animalOne.hashCode());
//        System.out.println(animalTwo.hashCode());
        System.out.println(animalOne.equals(animalTwo));
        System.out.println(animalOne==animalTwo);

    }
}
class Animal{
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}