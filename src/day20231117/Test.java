package day20231117;

public class Test {

    public static void main(String[] args) {
        String str = "abcba";
        StringBuffer sb = new StringBuffer(str);
        sb.reverse();
        if (str.equals(sb.toString())){
            System.out.println("是");
        }else {
            System.out.println("不是");
        }

    }
}
