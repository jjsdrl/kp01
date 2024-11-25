package day20231102;


//    设计小狗类需求:
//    抽象形成一个小狗类Dog
public class Dog {



    //    属性: 名字name 年龄age 品种kind 主人host 价格price
    private String name;
    private int age;
    private String host;
    private String kind;
    private double price;

    //    功能:
//    跑run: 无参，打印: 小狗Dog跑的老快了~
    public void run(){
        System.out.println("小狗"+name+"跑的老快了");
    }

    //    吃eat: 参数int n，打印: 小狗今晚要吃n根肉骨头

    public void eat(int n){
        System.out.println("小狗"+name+"今晚要吃"+n+"根肉骨头");
    }
    //    睡觉sleep: 参数double num，打印: 小狗睡了num个小时0

    public void sleep(double num){
        System.out.println("小狗"+name+"睡了"+num+"个小时");
    }


    //    玩play: 参数String host，返回值 String“飞盘”，打印: 小狗与主人host玩的很开心

    public String play(String host){
        System.out.println("小狗"+name+"与主人"+host+"玩的很开心");
        bark();
        return "飞盘";
    }

    //    叫bark: 打印: 小狗喜欢汪汪叫，封装此方法，玩play()的时候才bark()
    private void bark(){
        System.out.println("小狗"+name+"喜欢汪汪叫");
    }

    public Dog(String name, int age, String host, String kind, double price) {
        this.name = name;
        this.age = age;
        this.host = host;
        this.kind = kind;
        this.price = price;
    }

}
class TestDog{
    public static void main(String[] args) {
        Dog dog = new Dog("汪乔",20,"主人","添购",250);
        dog.eat(10);
        dog.sleep(24);
        dog.play("主人");
        dog.run();
    }
}