package day20231013;

public class TestOne {
    public static void main(String[] args) {
        int sum;
//        白球
        for (int i = 1; i < 6; i++) {
            //红球
            for (int j = 0; j < 4; j++) {
                //黑球
                for (int k = 0; k < 7; k++) {
                   sum = i + k +j ;
                   if (sum==8&&i>=1){
                       System.out.println("红球有"+j+"个，白球有"+i+"个，黑球有"+k+"个");
                   }
                }
            }
        }

    }
}
