package day20231114;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSimpleDateFormat {
    public static void main(String[] args) throws ParseException {
        Date time = new Date();
        //把Data类型的时间转为String类型的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
//        String strTime = sdf.format(time);
//        System.out.println(strTime);

        //把String类型的时间转为Data类型的时间
        String strTime = "2008/01-10 12:12:12";
        Date date = sdf.parse(strTime);
        System.out.println(date);

    }
}
