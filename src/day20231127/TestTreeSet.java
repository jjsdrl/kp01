package day20231127;

import lombok.Data;

import java.util.Iterator;
import java.util.Objects;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
//        TreeSet<String> treeSet = new TreeSet<>();
////        向集合中添加元素
//        treeSet.add("西施");
//        treeSet.add("王昭君");
//        treeSet.add("杨玉环");
//        treeSet.add("貂蝉");

//        遍历集合
//        treeSet.forEach(System.out::println);
        //打印出字符的unicode编码   排序根据用compareTo方法(返回值为正数，则排在后面)比较集合中元素的顺序来进行排序的
//        System.out.println((int)'西');
//        System.out.println((int)'王');
//        System.out.println((int)'杨');
//        System.out.println((int)'貂');
//        System.out.println("西施".compareTo("杨玉环"));


//        TreeSet<Pet> treeSet = new TreeSet<>();
//        treeSet.add(new Pet(1,"大黄"));
//        treeSet.add(new Pet(2,"柯基"));
//        treeSet.forEach(System.out::println);


        TreeSet<Integer> treeSet = new TreeSet<>();
//        向集合中添加元素
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        System.out.println("-----------------------------------------------------");
        //返回集合中大于或等于给定元素的最小元素（根据排序的前后顺序来确定大小，排在后面的就大，排在前面的就小）
//        Integer result = treeSet.ceiling(4);
//        System.out.println(result);
//        //获取集合中的第一个元素
//        System.out.println(treeSet.first());
////        获取集合中的最后一个元素
//        System.out.println(treeSet.last());
        //删除集合中的某个元素
//        treeSet.remove(4);
//        treeSet.forEach(System.out::println);

        //根据起始元素对象以及结束元素对象来截取集合中的部分元素(左闭右开原则)
        SortedSet<Integer> sortedSet = treeSet.subSet(2, 4);
        System.out.println(sortedSet);


    }

}
class Pet implements Comparable<Pet>{
    private int petAge;
    private String petName;
    public Pet(){};

    public int getPetAge() {
        return petAge;
    }

    public void setPetAge(int petAge) {
        this.petAge = petAge;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Pet(int petAge, String petName) {
        this.petAge = petAge;
        this.petName = petName;
    }


    @Override
    public String toString() {
        return "Pet{" +
                "petAge=" + petAge +
                ", petName='" + petName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return petAge == pet.petAge && Objects.equals(petName, pet.petName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(petAge, petName);
    }

    @Override
    public int compareTo(Pet o) {
        return this.petAge - o.getPetAge() == 0?this.petName.compareTo(o.getPetName()):this.petAge - o.getPetAge();
    }
}
