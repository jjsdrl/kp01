package day20231121;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class TestArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
//        list.add(null);
//        list.add(null);
//        list.add(null);
//        System.out.println(list.size());


        //向集合中添加元素
        list.add("马自达");
        list.add("奇瑞");
        list.add("奥迪");
        list.add("雅迪");

        //向集合中再添加一个集合
        List<String> listNew = new ArrayList<>();
        listNew.add("迪丽热巴");
        listNew.add("杨幂");
        listNew.add("刘诗诗");
        listNew.add("景甜");
        list.addAll(listNew);

        //遍历集合
        //for -i循环
/*        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        //for - each增强循环
        /*for (String s :list) {
            System.out.println(s);
        }*/
        //forEach方法遍历
//        list.forEach(new MyConsumer());
        //匿名内部类 创建了一个匿名内部类的对象，该匿名内部类实现了Consumer接口，因此要实现Consumer接口中的accept
       /* list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/

        //java8新特性，Lamda（λ）表达式
//        list.forEach((s) -> {System.out.println(s);});
        //java8新特性，方法引用
//        list.forEach(System.out::println);

        //删除掉集合中的所有元素
//        list.clear();
//        list.forEach(System.out::println);


        //返回集合中元素的个数
//        System.out.println(list.size());

        //根据传入的下标，返回该下标在集合中的元素
//        System.out.println(list.get(0));

        //判断集合中是否包含某一个元素
//        System.out.println(list.contains("马"));
//        System.out.println(list.contains("马自达"));

        //返回一个迭代器，迭代器中存储了集合中的所有元素
        /*Iterator<String> it = list.iterator();
        //it.hasNext()判断是否有下一个元素
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);

        }*/

        //判断指定元素在集合中的下标，若集合中不存在该元素，返回-1
//        System.out.println(list.indexOf("雅迪"));
//        System.out.println(list.indexOf("奔驰"));

        //判断集合中是否存在元素
/*        System.out.println(list.isEmpty());*/


        //从集合中移除元素
//        list.remove("雅迪");
//        list.remove(3);
//        list.forEach(System.out::println);
//

        //从集合中删除包含指定集合中的元素
//        list.removeAll(listNew);
//        list.forEach(System.out::println);

        //从集合中保留指定集合中的元素，其他元素都删除
//        list.retainAll(listNew);
//        list.forEach(System.out::println);

        //替换集合中指定下标位置上的元素
//        list.set(3,"大众途锐");
//        list.forEach(System.out::println);


        //截取集合中指定位置的子集和（左闭右开）
//        List<String> listnew = list.subList(1, 3);
//        listnew.forEach(System.out::println);

        //把集合转为Object类型的数组
        Object[] array = list.toArray();
        System.out.println(Arrays.toString(array));
    }
}
/*
class MyConsumer implements Consumer<String>{
    @Override
    public void accept(String s) {
        System.out.println(s);
    }

}*/
