package day20231024;




//创建一个Java类Employee，具有属性name、employeeId，以及一个抽象方法calculateSalary(). 然后创建两个子类Manager和Developer
// ，每个子类都实现calculateSalary()方法，以不同的方式计算工资。

 public abstract   class Employee {
    String name;
    int employeeId;
    public abstract double calculateSalary();
}
class Manager extends Employee{

    @Override
    public double calculateSalary() {
        return 0.0;
    }
}
class Developer extends Employee{

    @Override
    public double calculateSalary() {
        return 0.0;
    }
}