package day20231017;

public class Dog {

    private String dogName;

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    private int dogAge;
//    set方法
    public void setDogAge(int dogAge){
        if (dogAge>=0 &&dogAge<=20)
            //this当前对象
            this.dogAge=dogAge;
        else{
            System.out.println("您输入的狗狗的年龄不在0-20之间，数据有误，此处重置为0！！！");
            this.dogAge=0;
        }

    }
//    get方法

    public int getDogAge() {
        return dogAge;
    }
}
class TestDog{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setDogAge(50);
        System.out.println(dog.getDogAge());
    }
}
