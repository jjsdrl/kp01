package day20231130;

import java.util.TreeMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>();
        treeMap.put("张小凡","大黄");
        treeMap.put("李寻欢","加菲猫");
        treeMap.put("萧炎","美杜莎");
        treeMap.put("杨过","神雕");
//        treeMap.put(null,"神雕");
        treeMap.put("杨过",null);
//        treeMap.put("郭靖","神雕");
        treeMap.forEach((key, value) -> System.out.println("key:"+key+",value:"+value));
        System.out.println("------------------------------------------------------------------");
//        treeMap.compute("李寻欢",new MyClass());
//        treeMap.compute("李寻欢", (key, value) -> {
//            System.out.println(key);
//            System.out.println(value);
//            return key+value;
//        });
        treeMap.compute("李寻欢", (key, value) -> key+value);
        treeMap.forEach((key, value) -> System.out.println("key:"+key+",value:"+value));
    }
}
class MyClass implements BiFunction<String,String,String> {



    @Override
    public String apply(String key, String value) {
        System.out.println(key);
        System.out.println(value);
        return null;
    }
}