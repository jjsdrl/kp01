package day20231114;

import java.util.Date;

public class TestDate {
    public static void main(String[] args) {
        //获取当前的系统时间
        Date time = new Date();
        System.out.println(time);

        //获取年份
        System.out.println(time.getYear()+1900);

        //获取月份
        System.out.println(time.getMonth()+1);

        //获取日期
        System.out.println(time.getDate());

        //获取小时
        System.out.println(time.getHours());

        //获取分钟
        System.out.println(time.getMinutes());

        //获取秒
        System.out.println(time.getSeconds());

        //获取当前系统时间距离1970-01-01 00：00：00所经历的毫秒数
        System.out.println(time.getTime());
    }
}
