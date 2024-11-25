package day20231128;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        //向集合中添加键值对数据
        hashMap.put("郭富城","方媛");
        hashMap.put("邓超","孙俪");
        hashMap.put("周杰伦","昆凌");
        hashMap.put("黄晓明","AngelBady");
        hashMap.put("黄晓明","Angel");
        hashMap.put("张无忌","AngelBady");
        hashMap.put(null,null);
        //遍历集合
//        hashMap.forEach(new Myclass());
//        hashMap.forEach((String key,String  value) -> System.out.println("key:"+key+",value:"+value));
        //把Map集合中所有的key存入到一个set集合中
//        Set<String> set = hashMap.keySet();
//
//        for (String str:set
//             ) {
//            //通过传入指定的键，来获取Map集合中对应的值
//            String value = hashMap.get(str);
//            System.out.println("key:"+str+",value:"+value);
//        }


        //把Map集合中所有的键值对数据存入到一个set集合中
        //Map.Entry<String, String>是Node类型（存储的是键值对的数据）实现的接口
        /*Set<Map.Entry<String, String>> set = hashMap.entrySet();
        for (Map.Entry<String, String> entry:set) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("key:"+key+",value:"+value);
        }
*/

        //把Map集合中所有的值数据存入到一个Collection集合中
//        Collection<String> values = hashMap.values();
//        values.forEach(System.out::println);


        System.out.println("----------------------------------------------");
        //清除集合中的所有数据
//        hashMap.clear();
//        hashMap.forEach((String key,String  value) -> System.out.println("key:"+key+",value:"+value));

//        hashMap.compute("黄晓明", new BiFunction<String, String, String>() {
//            @Override
//            public String apply(String s, String s2) {
//                return null;
//            }
//        });

        //判断集合中是否包含指定的键
//        System.out.println(hashMap.containsKey("周杰伦"));
//        //判断集合中是否包含指定的值
//        System.out.println(hashMap.containsValue("方媛"));

        //判断集合中的元素（一条键值对数据）个数是否为0
//        System.out.println(hashMap.isEmpty());

        //从Map集合中根据传入的key来移除对应的键值对数据
//        hashMap.remove("黄晓明");
//        hashMap.forEach((String key,String  value) -> System.out.println("key:"+key+",value:"+value));

        //返回集合中元素的个数
//        System.out.println(hashMap.size());


        //根据传入的key和value来替换Map集合中该key所对应的value
        hashMap.replace("黄晓明",null);
        hashMap.forEach((String key,String  value) -> System.out.println("key:"+key+",value:"+value));
    }
}
class Myclass implements BiConsumer<String,String>{

    @Override
    public void accept(String key, String value) {
        System.out.println("key:"+key+",value:"+value);
    }

    @Override
    public BiConsumer<String, String> andThen(BiConsumer<? super String, ? super String> after) {
        return BiConsumer.super.andThen(after);
    }
}