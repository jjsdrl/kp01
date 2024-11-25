package day20231123;

import java.util.ArrayList;

public class TestOne {

    public static void main(String[] args) {
        /*for (char a = 'x'; a <= 'z' ; a++) {
            for (char b = 'x'; b <= 'z' ; b++) {
                for (char c = 'x'; c <= 'z' ; c++) {
                    if(a != 'x' && c != 'x' && c != 'z' && a != b && a != c && b != c){
                        System.out.println("a="+a+",b="+b+",c="+c);
                    }
                }
            }
        }*/
        //a=,b=,c=
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listTwo = new ArrayList<>();
        listOne.add("x");
        listOne.add("y");
        listOne.add("z");
        for (int i = 0; i < listOne.size(); i++) {
            String str = listOne.get(i);
            if(str != "x" && str != "z"){
                listTwo.add("c和"+str);
                listOne.remove(i);
            }
        }
        //此时listOne集合中只有x和z
        for (int i = 0; i < listOne.size(); i++) {
            if(!listOne.get(i).equals("x")){
                listTwo.add("a和"+listOne.get(i));
                listOne.remove(i);
            }
        }
        //此时listOne集合中只有x
        listTwo.add("b和"+listOne.get(0));

        System.out.println(listTwo);

    }
}
