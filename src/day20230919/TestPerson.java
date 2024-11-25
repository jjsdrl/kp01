package day20230919;

public class TestPerson {
    public static void main(String[] args) {
        //有一个村庄有10000人，每年都在前一年人口的基础上增加10%，请问，多少年后，该村的人口能够达到100万

        double j= 10000;
        int i = 0;
        while (j <= 1000000){
            i++;
            j = j + j * 0.1;

        }
        System.out.println(i);
    }
}
