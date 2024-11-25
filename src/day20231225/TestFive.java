package day20231225;

public class TestFive {
    public static void main(String[] args) {
        System.out.println("1-1000的完数：");
        for (int i = 1; i <= 1000; i++) {
            int num = 0;
            for (int j = 1; j < i; j++) {
                if (i%j == 0){
                 num+=j;
                }
            }
            if (i==num){
                System.out.println(num);
            }

        }
    }
}
