package day20231110;

public class TestFive {
//    猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，

//    又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
    public static void main(String[] args) {
        int dayten = 1;

        for (int i = 0; i < 9; i++) {
            dayten=(dayten +1)*2;
        }
        System.out.println("第一天摘了："+dayten+"个桃子！");
    }
}
