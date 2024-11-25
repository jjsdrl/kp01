package day20231027;

public class Animal {
}
class Panda extends Animal{

}
class Tiger extends Animal{

}
class   TestAnimal{
    public static void main(String[] args) {

//        Animal animal = new Panda();
//        instanceof 判断一个对象是否为某一种类型
//        System.out.println(animal instanceof Animal);
//        System.out.println(animal instanceof Panda);
//
//        Animal animal1 = new Animal();
//        System.out.println(animal instanceof Animal);
//        System.out.println(animal instanceof Panda);

        Animal animal = new Panda();//向上
        Panda panda =(Panda) animal;//向下
        Tiger tiger =(Tiger) animal;//向下   抛出类型转换异常

        double numOne =100;
        int numTwo = (int) numOne;

    }
}