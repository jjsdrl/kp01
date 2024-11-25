package day20231013;

public class TestFive {
    public static void main(String[] args) {
        int count =0;
        for (int i = 1; i <=100 ; i++) {
            if (i%3==0){
                count++;
                System.out.println(i);
            }
        }
        System.out.println("100以内能被3整除的数有"+count+"个");
    }
}