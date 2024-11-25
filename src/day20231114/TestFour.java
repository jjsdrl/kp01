package day20231114;

public class TestFour {
    public static void main(String[] args) {
        String email = "zhengcg@zparkhr.com";
        int x = email.indexOf("@");
        int y = email.indexOf(".");
        System.out.println(x);
        System.out.println(y);
        if (x>=0 &&y>=0&&x<y){
            System.out.println("该邮箱合法");
        }else {
            System.out.println("该邮箱不合法");
        }
    }
}
