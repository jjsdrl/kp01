package day20231024;




//创建一个名为Person的Java类，具有私有属性name和age
// ，以及公共构造函数和getAge方法。然后，创建一个Student类，继承自Person，具有一个额外的属性studentId，并覆盖getAge方法以返回学生的年龄。
public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
            this.name=name;
            this.age=age;
    }

    public int getAge() {
        return age;
    }
}
//class Student extends Person{
//    int studentId;
//
//    public Student(String name, int age , int studentId) {
//        super(name, age);
//        this.studentId=studentId;
//    }
//
//    @Override
//    public int getAge() {
//
//        return super.getAge();
//    }
//}
//class TestFive{
//    public static void main(String[] args) {
//        Student studentOne = new Student("王子卫", 10, 1001);
//        System.out.println(studentOne.getAge());
//
//    }
//}