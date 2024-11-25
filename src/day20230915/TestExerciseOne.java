package day20230915;

public class TestExerciseOne {
    public static void main(String[] args) {
        double fatherHeight = 177;
        double motherHeight = 165;
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double daughterHeight = (fatherHeight * 0.923 + motherHeight) / 2;
        System.out.println(sonHeight);
        System.out.println(daughterHeight);
    }

}
