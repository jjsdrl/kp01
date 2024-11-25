package day20231120;

public class TestClassGeneric {
    public static void main(String[] args) {
        Persson<Dog> personOne = new Persson<>("admin", new Dog());

        //h]getClass方法来源于Objecr类中，返回一个对象对应的类型；
        System.out.println(personOne.animal.getClass());
        Persson<Cat> personTwo = new Persson<>("bady", new Cat());
    }
}

class Persson<T>{
    String name;
    //养一只宠物（猫，狗，猪）
    T animal;
    public Persson(){

    }

    public Persson(String name,T animal) {
        this.name = name;
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Persson{" +
                "name='" + name + '\'' +
                ", animal=" + animal +
                '}';
    }
}
