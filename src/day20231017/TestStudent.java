package day20231017;

public class TestStudent {
    public static void main(String[] args) {
//        System.out.println(Student.studentAge); //静态的属性（类变量）不依赖于对象，通过类名去访问
//
//        Student student = new Student();
//        System.out.println(student.studentName);//非静态的属性（实例变量）依赖对象存在。需要通过对象名去访问
        Student studentOne = new Student();
        Student studentTwo = new Student();
        System.out.println(studentOne.studentName);
        System.out.println(studentTwo.studentName);
        System.out.println(studentOne.studentAge);
        System.out.println(studentTwo.studentAge);
        System.out.println("----------------------------------------------------------");
        Student.studentAge = 100;
        System.out.println(studentOne.studentAge);
        System.out.println(studentTwo.studentAge);//静态的属性（类属性）归所有对象共享，这些对象共享同一块内存空间
        studentOne.studentName = "汪乔";
        studentTwo.studentName = "王子卫";
        System.out.println(studentOne.studentName);
        System.out.println(studentTwo.studentName);//非静态的属性（实例变量）依赖于对象，一个对象对应一个实例变量，不同对象之间互不干扰
    }
}
class Student{
    String studentName = "王乔";
    static int studentAge =18;

}