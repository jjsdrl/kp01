package day20230920;

public class TestNine {
    public static void main(String[] args) {
        for (int i = 1; i < 10;i++){
            for (int j = 1; j<= i ;j++){
//                System.out.print(j + "X" + i + "=" + i*j + "\t");
                if ((i == 3 && j == 2) || (i == 4 && j == 2)){
                    System.out.print(j + "X" + i + "=" + i*j + "  ");
                }else {
                    System.out.print(j + "X" + i + "=" + i*j + " ");
                }

            }
            System.out.println();
        }


//        System.out.print("1*1=1  2*2=4  3*3=9  4*4=16 5*5=25 6*6=36 7*7=49 8*8=64 9*9=81 \n" +
//                "1*2=2  2*3=6  3*4=12 4*5=20 5*6=30 6*7=42 7*8=56 8*9=72 \n" +
//                "1*3=3  2*4=8  3*5=15 4*6=24 5*7=35 6*8=48 7*9=63 \n" +
//                "1*4=4  2*5=10 3*6=18 4*7=28 5*8=40 6*9=54 \n" +
//                "1*5=5  2*6=12 3*7=21 4*8=32 5*9=45 \n" +
//                "1*6=6  2*7=14 3*8=24 4*9=36 \n" +
//                "1*7=7  2*8=16 3*9=27 \n" +
//                "1*8=8  2*9=18 \n" +
//                "1*9=9");

    }
}