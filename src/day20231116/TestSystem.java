package day20231116;

import java.io.IOException;
import java.util.Arrays;

public class TestSystem {
    public static void main(String[] args) throws IOException {
//        System.out.println("111");
//        System.err.println("222");
//        //数组的复制
//
////        qrr为原数组
//        int []arr = {20,30,40,50};
//        int []arrNew = new int[arr.length];
//        System.arraycopy(arr,0,arrNew,0,arr.length);
////      遍历数组中的数据
//        System.out.println(Arrays.toString(arrNew));


        //获取当前时间的毫秒数
        System.out.println(System.currentTimeMillis());
        /*while (true){
            long time = System.currentTimeMillis();
            if (time >= 1700120798384L){
//                当值为0时，正常退出系统
                System.exit(0);
            };
        }
        */
           /* Animal animal = new Animal();
            animal = null;
            System.gc();
//            等待用户输入数据，阻塞线程，使得程序一直运行
            System.in.read();*/

        //获取系统的所有属性，例如配置的环境变量信息等
        System.out.println(System.getProperties());

    }
}

class  Animal{


    @Override
    protected void finalize() throws Throwable {
        System.out.println("该对象被回收");
        super.finalize();
    }
}
