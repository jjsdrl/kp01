package day20231106;

public class TestToStringMethod {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.hashCode());
        System.out.println(dog);
        System.out.println(dog.toString());
    }
}
class Dog{
    private String name ="大黄";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}