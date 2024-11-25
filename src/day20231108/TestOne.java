package day20231108;

public class TestOne {
}
class Student{
    private String name;
    private int age;
    private int studentId;
    private int score;
    //    提供构造方法，用于初始化学生对象的属性。
    public Student(){

    }
    public Student(String name, int age, int studentId, int score) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.score = score;
    }
    //    提供访问器方法（getter和setter）以允许外部代码访问和修改学生对象的属性。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    //    提供一个方法 printStudentInfo，用于打印学生的信息，格式如下：姓名: [姓名], 年龄: [年龄], 学号: [学号], 成绩: [成绩]。
    public void printStudentInfo(){
        System.out.println("姓名:[ "+name+"]，年龄:["+age+"]，学号:["+studentId+"],成绩:["+score+"]");
    }
    //    提供一个方法 isPassed，用于判断学生是否及格（成绩大于等于60分）。
    public void isPassed(){
        if (score<60){
            System.out.println("不及格");
        }else {
            System.out.println("及格");
        }
    }





}