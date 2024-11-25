package day20231127;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {

        //能够存储有序，不重复的元素
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("西施");
        linkedHashSet.add("王昭君");
        linkedHashSet.add("杨玉环");
        linkedHashSet.add("貂蝉");
        linkedHashSet.forEach(System.out::println);
    }
}
