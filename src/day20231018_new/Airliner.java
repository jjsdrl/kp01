package day20231018_new;

import day20231018.Plane;

public class Airliner extends Plane {
    public void fly(){
//        System.out.println(planeType);
//        System.out.println(planeWeight);//当子类和父类属于不同的包中，子类能够继承父类所有非私有，非默认的属性和方法
        System.out.println(planeColor);
        System.out.println(planeSpeed);
    }
}
