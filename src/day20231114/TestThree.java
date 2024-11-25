package day20231114;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

public class TestThree {
    public static void main(String[] args) {
        Worker work = new Worker("zhy",20,6000);

    }
}
class Worker{
    private String name;
    private int age;
    private double salary;
    public  Worker(){};

    public Worker(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}