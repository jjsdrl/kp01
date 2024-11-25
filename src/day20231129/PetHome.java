package day20231129;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PetHome {


    static HashMap<Master, Pet> petHomeMap = new HashMap<>();

    //    1).寄存宠物 depositPet（Master master ， Pet pet）
    public static void depositPet(Master master , Pet pet){
//        new PetHome().petHomeMap.put(master,pet);
        petHomeMap.put(master, pet);
    }
    //    2).领取宠物 receivePet（String masterName，String petName）
    public static void receivePet(String masterName,String petName){
        //根据传入的主人名称和宠物名称，匹配map集合中对应的键值对数据，若找到了，则删除掉map集合中的键值对数据
        Set<Map.Entry<Master, Pet>> entries = petHomeMap.entrySet();
        for (Map.Entry<Master, Pet> entry:entries
             ) {
            Master key = entry.getKey();
            Pet value = entry.getValue();
            if (key.getMasterName().equals(masterName)&&value.getPetName().equals(petName)){
                petHomeMap.remove(key);
                break;
            }
        }
    }
    //    3).查询所有主人和宠物信息的方法 showAllMasterAndPetInfo
    public static void showAllMasterAndPetInfo(){
        petHomeMap.forEach((Master master, Pet pet) -> System.out.println("主人信息:"+master+",宠物信息:"+pet));
    }
    public static void main(String[] args) {
        /*
         * 宠物之家
         * 1.Master masterId masterName  提供toString，get/set 构造方法有参无参
         * 2.Pet petId petName   提供toString，get/set 构造方法有参无参
         * 3.PetHome
         *   1).寄存宠物 depositPet（Master master ， Pet pet）
         *   2).领取宠物 receivePet（String masterName，String petName）
         *   3).查询所有主人和宠物信息的方法 showAllMasterAndPetInfo
         * */

        petHomeMap.put(new Master("光头强",1), new Pet("肥波",101));

        System.out.println("欢迎来到宠物之家！！！");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请输入你要执行的操作：1 寄存宠物 2 领取宠物 3 查询所有宠物信息 4 退出系统:");
            int choose = scanner.nextInt();
            if (choose == 1){
                System.out.print("请输入主人信息（光头强,1）:");
                String information = scanner.next();
                String[] masterArr = information.split(",");
                //Integer.parseInt把字符串类型的数据转为int类型的数据
                Master master = new Master(masterArr[0], Integer.parseInt(masterArr[1]));

                System.out.print("请输入宠物信息（肥波,101）:");
                String informationPet = scanner.next();
                String[] petArr = informationPet.split(",");
                Pet pet = new Pet(petArr[0], Integer.parseInt(petArr[1]));
                depositPet(master,pet);

            } else if (choose == 2) {
                System.out.print("请输入主人姓名（黄大,大黄）:");
                String information = scanner.next();
                String[] infoArr = information.split(",");
                receivePet(infoArr[0], infoArr[1]);

            } else if (choose == 3) {
                showAllMasterAndPetInfo();
            }else {
                System.out.println("感谢使用");
                break;
            }

        }
    }



}
class Master{
    private String masterName;
    private int masterId;
    public Master(){};

    public Master(String masterName, int masterId) {
        this.masterName = masterName;
        this.masterId = masterId;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public int getMasterId() {
        return masterId;
    }

    public void setMasterId(int masterId) {
        this.masterId = masterId;
    }

    @Override
    public String toString() {
        return "Master{" +
                "masterName='" + masterName + '\'' +
                ", masterId=" + masterId +
                '}';
    }
}
class Pet {
    private String petName;
    private int petId;

    public Pet() {
    }

    ;

    public Pet(String petName, int petId) {
        this.petName = petName;
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "petName='" + petName + '\'' +
                ", petId=" + petId +
                '}';
    }
}