package day20231124;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class TestHashSet {
    public static void main(String[] args) {
//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("毛晓彤");
//        hashSet.add("毛晓彤");
//        hashSet.add(null);
//        hashSet.add(null);
//        System.out.println(hashSet.size());

//        HashSet<Student> hashSet = new HashSet<>();
//        hashSet.add(new Student("蔡徐坤",20));
//        hashSet.add(new Student("蔡徐坤",20));
//
//        System.out.println(hashSet.size());

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("毛晓彤");
        hashSet.add("迪丽热巴");
        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()){
            String str = it.next();
            System.out.println(str);
        }
    }
}
class Student{
    private String studentName;
    private int studentAge;

    public Student(){};

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentAge == student.studentAge && Objects.equals(studentName, student.studentName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentName, studentAge);
    }

    public Student(String studentName, int studentAge) {
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Student(int studentAge) {
        this.studentAge = studentAge;
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
                "studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                '}';
    }
}