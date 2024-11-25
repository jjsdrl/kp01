package day20231120;

//泛型的上限和下限

import java.util.ArrayList;
import java.util.Collection;

public class TestGenericExtendsAndSuper {
    public static void main(String[] args) {
//        ArrayList<Number> numberOne = new ArrayList<>();
//        ArrayList<Integer> numberTwo = new ArrayList<>();
//        addExtends(numberOne);
//        addExtends(numberTwo);

//        ArrayList<Number> numberOne = new ArrayList<>();
//        ArrayList<Integer> numberTwo = new ArrayList<>();
//        ArrayList<String> numberThree = new ArrayList<>();
//        addSuper(numberOne);
//        addSuper(numberTwo);
//        addSuper(numberThree);
//
    }

    //泛型的上限 ?的类型只能是Number或者Number类型的子类
    public static void addExtends(Collection<? extends Number> collection){

    }

    //泛型的下限 ?的类型只能是Integer或者Integer类型的父类
    public  static void addSuper(Collection<? super Integer> collection){

    }
}

