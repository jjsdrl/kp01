package day20231123;

import java.util.ArrayList;
import java.util.List;

public class Ball {
    public static void main(String[] args) {
//        1、两个乒乓球队进行比赛，各出三人。甲队为a,b,c三人，乙队为x,y,z三人。
//        已抽签决定比赛名单。有人向队员打听比赛的名单。a说他不和x比，c说他不和x,z比，请编程序找出三队赛手的名单。

        for (char i = 'x'; i <= 'z'; i++) {
            for (char j = 'x'; j <= 'z'; j++) {
                if (i != j)
                    for (char k = 'x'; k <= 'z'; k++) {
                        if (i != k && j != k)
                            if (i != 'x' && k != 'x' && k != 'z')
                                System.out.println("a和" + i + "\n" + "b和" + j + "\n" + "c和" + k + "\n");
                    }
            }
        }
    }
}