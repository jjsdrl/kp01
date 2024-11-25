package day20231020;

public class Flower {
    public void smellNice(){
        System.out.println("花会散发出香味！！！");
    }
}
class Rose extends Flower{
    @Override
    public void smellNice() {
        System.out.println("玫瑰花散发出清香味！！！");
    }
}
class TestFlower{
    public static void main(String[] args) {
//        Flower flower = new Flower();
//        flower.smellNice();
        Flower flower = new Rose();
        flower.smellNice();


    }
}