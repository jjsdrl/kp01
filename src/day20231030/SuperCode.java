package day20231030;

public abstract class SuperCode {
    public abstract void executeCodeTime();
    public void calculateCodeTime(){
        long startTime = System.currentTimeMillis();
        executeCodeTime();
        long endTime = System.currentTimeMillis();
        System.out.println("代码执行所消耗的时间为"+(endTime-startTime)+"毫秒");

    }

}
class SonCodeOne extends SuperCode{
    @Override
    public void executeCodeTime(){
        for (int i=0 ; i<100000;i++){
            System.out.println(i+",");
        }
    }
}
class SonCodeOneTwo extends SuperCode{
    @Override
    public void executeCodeTime(){
        for (int i=0 ; i<10000;i++){
            System.out.println(i+",");
        }
    }
}
class Test{
    public static void main(String[] args) {
        SuperCode superCode = new SonCodeOne();
//        SuperCode superCode = new SonCodeOneTwo();
        superCode.calculateCodeTime();
    }
}