package day20231026;

public class TestSeven {

    public static void main(String[] args) {
        /*
        创建一个名为Person的Java类，具有属性name、age和gender，以及一个构造函数。然后创建一个Employee类，
        继承自Person，具有额外的属性employeeId，并覆盖toString()方法以返回员工信息的字符串表示。
         */
        Employee employee = new Employee("admin", 20, "男", 101);
        System.out.println(employee);
    }
}

class Person{
    String name;
    int age;
    String gender;
    public Person(){

    }
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
class Employee extends Person{
    int employeeId;
    public Employee() {
    }

    public Employee(String name, int age, String gender, int employeeId) {
        super(name, age, gender);
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", employeeId=" + employeeId +
                '}';
    }
}
