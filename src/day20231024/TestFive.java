package day20231026;

public class TestFive {
    public static void main(String[] args) {
        /*
        创建一个名为Student的Java类，具有属性name和age，以及一个构造函数。然后创建一个Course类，
        该类包含一个课程名称属性和一个学生列表。实现方法来添加和删除学生，并计算平均年龄。
         */
        Course course = new Course();
        course.addStudent(new Student("迪丽热巴",18));
    }
}
class Course{
    Student[] students = new Student[10];
    int index = -1;//指向数组中存储的最后一个学生的下标
    public void addStudent(Student student){
        if(index == students.length-1){
            System.out.println("该门课程已被选满，不允许再选!!!");
            return;
        }
        students[++index] = student;
    }
    //假设删除admin2
    //{"admin1","admin2","admin3","admin4","admin5","admin6",null,null,null,null}
    //{"admin1","admin3","admin4","admin5","admin6",null,null,null,null,null}
    public void deleteStudent(String name){
        for (int i = 0; i < students.length; i++) {
            if(name.equals(students[i].name)){
                int j = i;   // i,j = 4    index = 5
                while (j < index){
                    students[j] = students[j+1];
                    j++;
                }
                students[index]=null;
                index--;
                break;
            }
        }
    }
    //遍历学生
    public void showAllStudents(){
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null){
                System.out.print("null,");
            }else{
                System.out.print(students[i].name+",");

            }
        }
        System.out.println();
    }
}
class Student{
    String name;
    int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
