package day20231106;

import java.io.IOException;

public class TestFinalizeMethod {
    public static void main(String[] args) throws IOException {
        Pig pig = new Pig();
        pig = null;
        System.gc();//运行垃圾回收器，使得垃圾回收器尽最大可能回收垃圾对象
        System.in.read();//阻塞线程，使得程序一直处于运行中
    }
}
class Pig{
    @Override
    protected void finalize() throws Throwable {
        System.out.println("该对象被回收了");
        super.finalize();
    }
}