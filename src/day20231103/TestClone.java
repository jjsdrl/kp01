package day20231103;

public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Pet pet = new Pet();

//        Object obj = pet.clone();
        Pet petNew = (Pet) pet.clone();
        System.out.println(petNew==pet);//克隆出来的对象和原对象在内存中的地址不同
    }
}

//类只有实现了Cloneable接口，该类的对象才能被克隆
class Pet implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}