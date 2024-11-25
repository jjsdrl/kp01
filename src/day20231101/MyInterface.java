package day20231101;

public interface MyInterface {
//    public MyInterface(){};
    public final static String name = "admin";
    public abstract void transformData();
    default void fly(){
        System.out.println("飞行能力");
    }
    static void readBook(){
        System.out.println("阅读能力");
    }
}

interface A{
void read();
}
interface B{
void  write();
}
interface AB extends A,B{

}

class Test{
    String name = "admin";
    public static void main(String[] args) {
//        new MyInterface();//接口不能实例化
    }
}
class Myclass implements A,B{

    @Override
    public void read() {
        System.out.println("读");
    }

    @Override
    public void write() {
        System.out.println("写");
    }
}