package day20230919;

public class TestDoWhile  {

	public static void main(String[] args){
        //打印1-100以内所有的值
        int i=1;
        int x = 1;
        do{
            System.out.println(i);
            i++;
        }while (i  <= 100);


        int sum= 0;
        do {
            sum += x;
            x++;
        } while (x <= 100);
        System.out.println(sum);

    }
}
