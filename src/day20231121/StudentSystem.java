package day20231121;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎管理员登录学生管理系统！！！");
        List<Student> list = new ArrayList();
        while (true){
            System.out.print("请输入你想进行的操作：1.添加  2.删除  3.修改  4.查询单个学生  5.查询所有学生  6.退出系统：");
            int num = scanner.nextInt();
            boolean flag = true;
            if (num == 1){
                System.out.print("请输入学生信息（1,admin,20）:");
                String information = scanner.next();
                String[] split = information.split(",");
                String studentId = split[0];
                String name = split[1];
                String age = split[2];
                boolean add = list.add(new Student(studentId, name, age));
                if (add)
                    System.out.println("添加成功");
                else
                    System.out.println("添加失败");
            } else if (num == 2) {
                System.out.print("请输入你想删除的学生的学号：");
                String delid = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).studentId.equals(delid)){
                        flag=true;
                        delid =String.valueOf(i);
                    }
                }
                if (flag==true){
                    list.remove(Integer.parseInt(delid));
                    System.out.println("删除成功");
                    System.out.println();
                }else {
                    System.out.println("学生不存在！！！");
                    System.out.println();
                }

            } else if (num == 3) {
                System.out.print("请输入你想修改学生信息的学号：");
                String changeid = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).studentId.equals(changeid)){
                        flag=true;
                        changeid =String.valueOf(i);
                    }
                }
                if (flag==true){
                    System.out.print("请输入修改后学生信息("+list.get(Integer.parseInt(changeid))+"):");
                    String information = scanner.next();
                    String[] split = information.split(",");
                    String studentId = split[0];
                    String name = split[1];
                    String age = split[2];
                    list.set(Integer.parseInt(changeid),new Student(studentId,name,age));
                }else {
                    System.out.println("学生不存在！！！");
                    System.out.println();
                }
            } else if (num == 4) {
                System.out.print("请输入你想查询学生信息的学号：");
                String findid = scanner.next();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).studentId.equals(findid)){
                        flag=true;
                        findid =String.valueOf(i);
                    }
                }
                if (flag==true){
                    System.out.println(list.get(Integer.parseInt(findid)));
                    System.out.println();
                }else {
                    System.out.println("学生不存在！！！");
                    System.out.println();
                }
            } else if (num == 5) {
                list.forEach(System.out::println);
                System.out.println();
            }else {
                System.out.println("感谢使用!!!");
                break;
            }
        }
    }
}
class Student{
    String studentId = "";
    String name="";
    String age = "";

    public  String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(){};
    public Student(String studentId,String name , String age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
