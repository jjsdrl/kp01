package day20231128;


import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PetHome {


    static HashMap<Master, Pet> petHomeMap = new HashMap<>();

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

        petHomeMap.put(new Master("光头强",1), new Pet("肥波",1));

        System.out.println("欢迎来到宠物之家！！！");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.print("请输入你要执行的操作：1 寄存宠物 2 领取宠物 3 查询所有宠物信息 4 退出系统:");
            int choose = scanner.nextInt();
            if (choose == 1){
                System.out.print("请输入主人信息（光头强,1）:");
                String information = scanner.next();
                String[] masterArr = information.split(",");
                Master master = new Master(masterArr[0], Integer.parseInt(masterArr[1]));
                System.out.print("请输入宠物信息（肥波,1）:");
                String informationPet = scanner.next();
                String[] petArr = informationPet.split(",");
                Pet pet = new Pet(petArr[0], Integer.parseInt(petArr[1]));
                depositPet(master,pet);

            } else if (choose == 2) {
                System.out.print("请输入主人姓名（黄大,大黄）:");
                String information = scanner.next();
                String[] infoArr = information.split(",");
                boolean result = receivePet(infoArr[0], infoArr[1]);
                if (result){
                    System.out.println("领取成功，欢迎下次光临！！！");
                }else {
                    System.out.println("领取失败，为查询到相关信息！！！");
                }
            } else if (choose == 3) {
                showAllMasterAndPetInfo();
            }else {
                System.out.println("感谢使用");
                break;
            }

        }
    }


    //    1).寄存宠物 depositPet（Master master ， Pet pet）
    public static void depositPet(Master master , Pet pet){
        petHomeMap.put(master, pet);
    }
    //    2).领取宠物 receivePet（String masterName，String petName）
    public static boolean receivePet(String masterName,String petName){
        for (int i = 0; i < petHomeMap.size(); i++) {
            Set<Master> set = petHomeMap.keySet();
            for (Master master:set
            ) {
                //通过传入指定的键，来获取Map集合中对应的值
                Pet pet = petHomeMap.get(master);
                if (master.getMasterName().equals(masterName)&&pet.getPetName().equals(petName)){
                    petHomeMap.remove(master);
                    return true;
                }
            }

        }
        return false;
    }
    //    3).查询所有主人和宠物信息的方法 showAllMasterAndPetInfo
    public static void showAllMasterAndPetInfo(){
        petHomeMap.forEach((Master master,Pet  pet) -> System.out.println("主人信息:"+master+",宠物信息:"+pet));
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
class Pet{
    private String petName;
    private int petId;
    public Pet(){};

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