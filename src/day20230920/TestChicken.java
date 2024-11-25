package day20230920;

public class TestChicken {
    //百钱买百鸡
//    100元买100只鸡，母鸡5元一只，公鸡3元一只，小鸡1元三只，请问一共有多少种购买的方法？（每一种鸡都至少要买一只）
//    假设母鸡x只，公鸡y只，小鸡z只
//    x + y + z = 100
//    5 * x + 3 * y + z / 3 = 100
//    15*x+9*y+z=300   ---》  14*x+8*y=200
    public static void main(String[] args) {

//        for (int x = 1;x < 20;x++){
//            for (int y = 1;y < 33;y++){
//                for (int z = 1;z < 100;z++){
//                    if ((x + y + z ==100) && (5 * x +3.0 * y + z / 3 ==100)){
//                        System.out.println("母鸡的数量为："+x+"只，公鸡数量为："+y+"只，小鸡数量为"+z+"只！！！");
//                    }
//                }
//            }

        for (int x = 1; x <20;x++){
            for (int y = 1;y < 33;y++){
                int z = 100 -x -y;
                if (x + y + z ==100 && 5 * x +3 * y + z / 3 ==100 && z % 3 ==0){
                    System.out.println("母鸡的数量为："+x+"只，公鸡数量为："+y+"只，小鸡数量为"+z+"只！！！");
                }
            }

        }
    }



}
