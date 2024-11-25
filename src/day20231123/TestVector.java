package day20231123;

import java.util.ArrayList;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

public class TestVector {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
//        System.out.println(vector.capacity());
//        vector.add("刘亦菲");
//        vector.add("刘亦菲");
//        vector.add("刘亦菲");
        vector.add("刘亦菲");
//        vector.add("刘亦菲");
//        vector.add("刘亦菲");
//        vector.add("刘亦菲");
//        vector.add("刘亦菲");
//        vector.add("刘亦菲");
//        vector.add("刘亦菲");
//        System.out.println(vector.capacity());
//        System.out.println("----------------");
//        vector.add("刘亦菲");
//        System.out.println(vector.capacity());

//        ArrayList<String> list = new ArrayList<>();
//
////        开启一个线程
//        for (int i = 0; i < 10; i++) {
//            new Thread(new Runnable(){
//                @Override
//                public void run() {
//                    list.add("admin"+Math.random());
////                    try {
////                        //使当前线程休息一秒钟
////                        TimeUnit.SECONDS.sleep(1);
////                    } catch (InterruptedException e) {
////                        throw new RuntimeException(e);
////                    }
//                }
//            }).start();
//        }
//        list.forEach(System.out::println);

        //在集合的尾部添加元素
        vector.addElement("刘德华");
        vector.forEach(System.out::println);
        System.out.println(vector.capacity());
        //把集合的容量设置为集合中元素的个数（释放一部分的内存空间）
        vector.trimToSize();
        System.out.println(vector.capacity());

    }
}