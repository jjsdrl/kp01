package day20231123;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("张三丰");
        list.add("王阳明");
        list.add("迈克尔杰克逊");
        list.add("林俊杰");
        list.forEach(System.out::println);
        System.out.println("-----------------------");
//        //在集合的头部添加元素
//        list.addFirst("保时捷");
//        //在集合的尾部添加元素
//        list.addLast("劳斯莱斯");
//        list.forEach(System.out::println);
//
//        //检索但不删除此列表的头（第一个元素）
//        String first = list.peek();
//        System.out.println(first);
//        list.forEach(System.out::println);

        //检索并删除此列表的头（第一个元素）
        String first = list.poll();
        System.out.println(first);
        System.out.println("---------------------------");
        list.forEach(System.out::println);
        System.out.println("---------------------------");

        //根据传入的下标和元素，替换集合中指定位置上的元素
        list.set(1,"秦始皇");
        list.forEach(System.out::println);
    }
}
