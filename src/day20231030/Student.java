package day20231030;

public class Student {
//    2.自身成为自身的静态属性
    private static Student student=null;
//    1.构造方法私有化
    private Student(){}

//	3.提供一个外部类能够访问的获取该类对象的静态方法
    public synchronized static Student getInstance(){
        if (student==null){
            student = new Student();
        }
        return student;
    }

}
class TestStudent{
    public static void main(String[] args) {
//        new Student();
//        System.out.println(Student.getInstance());
//        System.out.println(Student.getInstance());
//        System.out.println(Student.getInstance());
//        System.out.println(Student.getInstance());
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    System.out.println(Student.getInstance());
                }
            }).start();
        }


    }
}
