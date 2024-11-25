package day20231116;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TestTime {
    public static void main(String[] args) {
        //获取年月日
        System.out.println(LocalDate.now());
        //获取时分秒
        System.out.println(LocalTime.now());
        //获取年月日 时分秒
        System.out.println(LocalDateTime.now());
    }
}

