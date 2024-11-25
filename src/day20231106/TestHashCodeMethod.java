package day20231106;



public class TestHashCodeMethod {
    public static void main(String[] args) {
        Pet petOne = new Pet();
        Pet petTwo = new Pet();
//        petTwo,petOne两个对象在内存中的地址是不一样的，因此hash值也不一样
        System.out.println(petTwo.hashCode());
        System.out.println(petOne.hashCode());
        System.out.println(petOne.getClass());
    }
}
class Pet{

}
