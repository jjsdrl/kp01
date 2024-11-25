package day20231011;

public class Dog {
    /*
    * 1.属性定义的地方和属性访问的地方在同一个类中
    * 2.属性定义的地方和属性访问的地方在同一个包的不同类中
    * 3.属性定义的地方和属性访问的地方在不同包的不同类中，但这两个类拥有继承关系（子父类关系）
    * 4.属性定义的地方和属性访问的地方在不同包的不同类中，这两个类没有继承关系（子父类关系）
    *
    * */


    //属性定义的地方
    private String dogName ="王滋味";
    int dogAge = 20;
    protected String dogColor ="黑色";
    public String dogType = "舔狗";
    void introduce(){
        //属性访问的地方
        System.out.println(dogName);
        System.out.println(dogAge);
        System.out.println(dogColor);
        System.out.println(dogType);
    }
}
class TestDog{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.introduce();

    }
}
