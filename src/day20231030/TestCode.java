package day20231030;

public class TestCode{
    public static void main(String[] args) {
        //返回当前系统时间距离1970-01-01-0：0：0：0所经历过的毫秒数
//        System.out.println(System.currentTimeMillis());
        long startTime = System.currentTimeMillis();
        executeCode();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);

    }
    public static void executeCode(){
        for (int i = 0; i < 10000; i++) {
            System.out.println("i="+i);
        }
    }
}
