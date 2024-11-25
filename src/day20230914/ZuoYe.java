package day20230914;

public class ZuoYe {
    public static void main(String[] args) {
        int fatherStature = 177;
        int motherStatrue = 165;
        System.out.println("已知父亲身高177CM,母亲身高165CM");
        System.out.println("预计儿子的身高为:" + (fatherStature + motherStatrue) * 1.08 / 2 + "CM");
        System.out.println("预计女儿的身高为:" + (fatherStature * 0.923 + motherStatrue) / 2 +"CM");
    }
}
