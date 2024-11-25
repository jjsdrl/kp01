package day20230914;

import java.io.*;




public class TestCopyFile {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("E:\\zp\\java\\kp01\\src\\day20230914\\cat.jpg");
        FileOutputStream fileOutputStream = new FileOutputStream("E:\\zp\\java\\kp01\\src\\day20230914\\cat1.jpg");
        int data = fileInputStream.read();
        while (data != -1){
//             fileOutputStream.write(data); //正常复制
           fileOutputStream.write(data^5); // 利用异或加密
            data = fileInputStream.read();
        }
        fileOutputStream.flush();
        fileInputStream.close();
        fileInputStream.close();

//        还原
        /*public static void main(String[] args) throws Exception {
            FileInputStream fileInputStream = new FileInputStream("E:\\zp\\java\\kp01\\src\\day20230914\\cat1.jpg");
            FileInputStream fileOutputStream = new FileInputStream("E:\\zp\\java\\kp01\\src\\day20230914\\cat.jpg");
            int data = fileInputStream.read();
            while (data != -1){
                fileOutputStream.write(data^5);
                data = fileInputStream.read();
            }
            fileOutputStream.flush();
            fileInputStream.close();
            fileInputStream.close();*/
    }


}
