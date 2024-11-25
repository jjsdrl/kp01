package day20231019;

public class Student {

    String studentName;

    //保留默认的无参构造方法
//    public Student() {
////        study();//构造方法中可以调用普通的成员方法
////        this("王紫薇");
//    }

    public static void study(){
//        Student();//但普通的成员方法中不能调用构造方法
        System.out.println("学生喜欢学技术！！！");
    }

    //人为定义的有参的构造方法
    public Student(String studentName){
//        this();
        this.studentName=studentName;
    }

}

class MiddleSchoolStudent extends Student{
    /*public void Student(){

    }*/ //构造方法不能被继承，因此也不能被重写，但是可以重载

    public MiddleSchoolStudent(){
        super("wzw");//调用父类的无参构造方法
    }
}

class TestStudent{
    public static void main(String[] args) {
//        new Student();//任意创建的类都默认拥有一个无参的构造方法（看不见）
//        new Student();//若人为的定义一个构造方法，则默认的无参构造方法就会消失
    }
}

