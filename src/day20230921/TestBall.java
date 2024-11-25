package day20230921;

public class TestBall {

    public static void main(String[] args) {
        //一个小球从10米高空落下，每一次落下又会反弹到前一次高度的一半，请问第十次反弹到最高点时，小球一共经历了多少米

//        double distance = 15;
//        double sum = 0;
//        for (int i = 0;i < 10; i++){
//            sum += distance ;
//            distance /= 2 ;
//
//
//        }
//        System.out.println("一共走了"+sum+"米");

        //一个小球从10米高空落下，每一次落下又会反弹到前一次高度的一半，请问第十次落到地面时，小球一共经历了多少米

        double distance = 10;
        double sum = 0;
        for (int i = 0 ; i<9;i++){
            sum +=distance;
            distance /=2;
        }
        System.out.println("一共走了"+(sum+10)+"米");
    }
}
