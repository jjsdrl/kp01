package day20231019;

public class Animal {



    //父类中final修饰符修饰的方法子类只能继承，不能重写
    public /*final*/ void shout(){
        System.out.println("动物都会叫喊!!!");
    }


    //子类中重写的方法抛出的异常不能比父类的更大
    /*public void shout() throws Throwable{
        System.out.println("动物都会叫喊!!!");
    }*/


    //子类中重写的方法的访问修饰符不能比父类中的方法的访问修饰符更严格(小)
    /*void shout(){
        System.out.println("动物都会叫喊!!!");
    }*/


    //子类中重写的方法的返回值类型必须和父类中的方法的返回值类型相同或者是父类中方法的返回值类型的子类
    /*public Number shout(){
        System.out.println("动物都会叫喊!!!");
        return 10;
    }*/


    //正常的重写
    /*public void shout(){
        System.out.println("动物都会叫喊!!!");
    }*/


}
class Dog extends Animal{


    public void shout(){
        System.out.println("我是汪汪的叫!!!");
    }


    /*public void shout() throws Exception{
        System.out.println("我是汪汪的叫!!!");
    }*/


    /*public void shout(){
        System.out.println("我是汪汪的叫!!!");
    }*/


    /*public Integer shout(){
        System.out.println("我是汪汪的叫!!!");
        return 100;
    }*/


    /*public void shout(){
        System.out.println("我是汪汪的叫!!!");
    }*/


    /*@Override    //注解
    public void shout() {
        //super.shout();
        System.out.println("我是汪汪的叫!!!");
    }*/

}
