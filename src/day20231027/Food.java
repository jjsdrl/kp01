package day20231027;

public abstract class Food {


    public Food() {
    }

    public abstract void offerNutrition();
    public  void  smellNice(){
        System.out.println("食物散发香味");
    }

//     public void offerNutrition(){
//         System.out.println("食物能够提供营养！！！");
//     }
}

class Apple extends Food{
    @Override
    public void offerNutrition(){
        System.out.println("苹果能够提供各种维生素营养！！！");
    }
}
class Meat extends Food{
    @Override
    public void offerNutrition() {
        System.out.println("肉可以提供各种蛋白质营养！！！");
    }
}
abstract class Sugar extends Food{
//    public void offerNutrition(){
//        System.out.println("肉可以提供各种能量！！！");
//    }


}
class TestFood{
    public static void main(String[] args) {
//        new Food();


    }
}