package day20231025;

public class TestOne {

    public static void main(String[] args) {
        //创建一个名为Person的Java类，具有私有属性name和age，以及公共构造函数和getAge方法。然后，创建一个Student类，
        // 继承自Person，具有一个额外的属性studentId，并覆盖getAge方法以返回学生的年龄。
        Student student = new Student();
        System.out.println(student.getAge());
    }
}

class Person{
    String name;
    private int age = 20;
    public Person(){
    }
    public int getAge() {
        return age;
    }
}
class Student extends Person{
    int studentId;
    @Override
    public int getAge() {
        return super.getAge();
    }
}
