package day20231010;

public class Pig {


    double weight;
    char c;
    void  eat(){
        System.out.println(c);
        String pigName = "王子卫";
        System.out.println("重量为"+weight+"斤的"+pigName+"正在吃大白菜！！！");

    }

}

class TestPig{
    public static void main(String[] args) {
        //通过new类的构造方法创建出这个类的对象
        Pig pig = new Pig();
        pig.eat();

    }
}