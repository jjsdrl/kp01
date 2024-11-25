package day20231102;

public class TestAbstractAndInterface {
}
abstract class Fruit{
    private static final String name = "苹果";//抽象类的属性的定义没有限制
    public  Fruit(){
    }
    public  abstract void offerNutrition();
    private void offerSugar(){
        System.out.println("糖分");
    }
}
class Apple extends Fruit{

    @Override
    public void offerNutrition() {

    }
}

interface Swimming{
    int age =18;
//    public Swimming(){}
    void Swimming();
    default void add(){

    }
    static void delete(){

    }
}
class Person implements Swimming{

    @Override
    public void Swimming() {

    }

    @Override
    public void add() {

    }
}