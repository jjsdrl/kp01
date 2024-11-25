package day20231011_one;

import day20231011.Dog;

import java.util.Date;

public class SmallDog extends Dog {
    void shout(){
//        System.out.println(dog.dogName);//private 只有在同一个类中才能访问
//        System.out.println(dogAge);   //默认的   同一个包中不同类能访问 同一个类中能访问
        System.out.println(dogColor);
        System.out.println(dogType);
    }
}
