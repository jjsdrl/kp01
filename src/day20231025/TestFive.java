package day20231025;

public class TestFive {
    public static void main(String[] args) {
        Course course = new Course();
        course.addStudent(new StudentOne("王子为",18));
        course.addStudent(new StudentOne("王大卡",18));
        course.addStudent(new StudentOne("王黑鬼",18));
        course.addStudent(new StudentOne("王滋味",18));
        course.addStudent(new StudentOne("王紫薇",18));
        course.showStudent();
    }
}

class Course{
    StudentOne [] students =new StudentOne[10];
    int index = -1 ;
    public void addStudent(StudentOne studentOne){
        if (index == students.length-1){
            System.out.println("该门课程已被选满，不允许再选");
            return;
        }
        students[++index]= studentOne;
    }
    public void deleteStudent(String name){
        for (int i=0;i<students.length;i++){
            if (name.equals(students[i].name)){
             while (i<index){
                 students[i]=students[i+1];

             }
             students[index]=null;
             index--;
            }

        }
    }
    public void showStudent(){
        for (int i=0;i<students.length;i++){
            if (students[i]==null){
                System.out.print("null,");
            }else {
                System.out.print(students[i].name+",");
            }
            }

        }
    }



class StudentOne{
    String name;
    int age;
    public StudentOne(){

    }

    public StudentOne(String name, int age) {
        this.name = name;
        this.age = age;
    }
}