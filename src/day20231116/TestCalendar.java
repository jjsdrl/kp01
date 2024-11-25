package day20231116;

import java.util.Calendar;

public class TestCalendar {
    public static void main(String[] args) {
        //父类接收子类对象
        Calendar calendar = Calendar.getInstance();
        //获取年份
        System.out.println(calendar.get(calendar.YEAR));
        //获取月份
        System.out.println(calendar.get(calendar.MONTH));
        //获取日期
        System.out.println(calendar.get(calendar.DATE));
        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
        //获取小时
        System.out.println(calendar.get(calendar.HOUR));
        System.out.println(calendar.get(calendar.HOUR_OF_DAY));
        //获取分钟
        System.out.println(calendar.get(calendar.MINUTE));
        //获取秒
        System.out.println(calendar.get(calendar.SECOND));

    }
}
