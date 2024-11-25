package day20231122;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Student {
    private int studentId;
    private String studentname;
    private int studentAge;
    public Student(){};

    public Student(int studentId, String studentname, int studentAge) {
        this.studentId = studentId;
        this.studentname = studentname;
        this.studentAge = studentAge;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentname='" + studentname + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}
class TestStudent{
    //存储所有的学生信息
    static List<Student> list = new ArrayList();

    //添加学生的方法
    public static boolean addStudent(Student student){
        for (int i = 0; i < list.size(); i++) {
            //获取集合中指定下标上对应的学生对象，把学生对象的学号和传入的学号进行对比
            if (list.get(i).getStudentId()==student.getStudentId()){
                System.out.println("该学号已使用");
                return false;
            }
        }
        return list.add(student);
    }

    //查询所有学生的方法
    public static void findAllStudent(){
        list.forEach(System.out::println);
    }

    //根据学号删除学生信息的方法
    public static boolean deleteStudentById(int studentId){
        boolean flag =false;
        for (int i = 0; i < list.size(); i++) {
            //获取集合中指定下标上对应的学生对象，把学生对象的学号和传入的学号进行对比
            if (list.get(i).getStudentId()==studentId){
                //把集合中指定下标上的学生删除
                list.remove(i);
                flag = true;
                break;
            }
        }
        return flag;
    }

    //根据学号查询出对应的学生信息
    public static void findStudentById(int studentId){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getStudentId()==studentId){
//                System.out.println(list.get(i));
//                break;
//            }
//        }
        list.forEach(student -> {
            if (student.getStudentId()==studentId){
                System.out.println(student);
                return;
            }
        });
    }

//    根据学生id修改学生信息


    public static boolean changeStudentById(Student student){
        boolean flag =false;
        for (int i = 0; i < list.size(); i++) {
            Student oldstudent = list.get(i);
            if (oldstudent.getStudentId() == student.getStudentId()) {
                list.set(i,student);
                flag = true;
                break;
            }
        }
        return flag;
    }
//    public static boolean changeStudentById(int studentId){
//        Scanner scanner = new Scanner(System.in);
//        boolean flag =false;
//        for (int i = 0; i < list.size(); i++) {
//            //获取集合中指定下标上对应的学生对象，把学生对象的学号和传入的学号进行对比
//            if (list.get(i).getStudentId() == studentId) {
//                System.out.print("请输入修改后学生信息（admin,20）:");
//                String information = scanner.next();
//                String[] studentArr = information.split(",");
//                //根据用户传入的信息修改对应的学生对象
//                Student student = new Student(studentId, studentArr[0], Integer.parseInt(studentArr[1]));
//                list.set(i,student);
//                flag = true;
//                break;
//            }
//        }
//        return flag;
//    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎管理员登录学生管理系统！！！");
        while (true){
            System.out.print("请输入你想进行的操作：1.添加  2.删除  3.修改  4.查询单个学生  5.查询所有学生  6.退出系统：");
            int result = scanner.nextInt();
            if (result == 1){
                System.out.print("请输入学生信息（1,admin,20）:");
                String information = scanner.next();
                String[] studentArr = information.split(",");
                //根据用户传入的信息创建对应的学生对象
                Student student = new Student(Integer.parseInt(studentArr[0]), studentArr[1], Integer.parseInt(studentArr[2]));
                boolean flag = addStudent(student);
                if (flag)
                    System.out.println("添加学生成功");
                else
                    System.out.println("添加学生失败");
            }else if (result ==2) {
                System.out.print("请输入你想删除的学生的学号：");
                int delid = scanner.nextInt();
                boolean flag = deleteStudentById(delid);
                if (flag)
                    System.out.println("删除学生成功");
                else
                    System.out.println("删除学生失败");
            }else if (result ==3) {
                System.out.print("请输入你想修改的学生信息（1,admin,20）：");
                String information = scanner.next();
                String[] studentArr = information.split(",");
                //根据用户传入的信息创建对应的学生对象
                Student student = new Student(Integer.parseInt(studentArr[0]), studentArr[1], Integer.parseInt(studentArr[2]));
                boolean flag = changeStudentById(student);
                if (flag)
                    System.out.println("修改学生成功");
                else
                    System.out.println("修改学生失败");
            }else if (result ==4) {
                System.out.print("请输入你想查询的学生的学号：");
                int findId = scanner.nextInt();
                findStudentById(findId);
            }else if (result ==5) {
                findAllStudent();
            }else{
//                System.exit(0);//正常退出java虚拟机
                System.out.println("感谢使用!!!");
                break;
            }
        }
    }
}