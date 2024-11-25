package day20231129;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TestMapAndList {
    public static void main(String[] args) {
        //实现一个主人养多个宠物
        HashMap<Master, List<Pet>> hashMap = new HashMap<>();
        Master masterOne = new Master("西施", 1);
        List<Pet> petsOne = new ArrayList<>();
        petsOne.add(new Pet("大黄",1));
        petsOne.add(new Pet("皮卡丘",2));
        hashMap.put(masterOne,petsOne);

        //遍历
        hashMap.forEach(((master, pets) -> System.out.println("master:"+master+",pets:"+pets)));
    }
}
