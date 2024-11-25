package day20231018;

public class Plane {

    private String planeType;
    int planeWeight;
    protected String planeColor;
    public double planeSpeed;


}

//无人机
class Drone extends Plane{
    public void fly(){
//        System.out.println(planeType);//当子类和父类属于同一个包中，子类能够继承父类所有非私有的属性（非private修饰的）和方法

        System.out.println(planeColor);
        System.out.println(planeSpeed);
        System.out.println(planeWeight);
    }
}
