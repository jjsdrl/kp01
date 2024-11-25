package day20231130;

import java.util.Hashtable;

public class TestHashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,null);
//        hashtable.put(null,"大黄");
        hashtable.put("张小凡","大黄");
        hashtable.put("李寻欢","加菲猫");
        hashtable.put("萧炎","美杜莎");
        hashtable.put("杨过","神雕");
        hashtable.put("杨过","神雕");
        hashtable.put("郭靖","神雕");
        hashtable.forEach((key, value) -> System.out.println("key:"+key+",value:"+value));
    }
}
