package day20231110;

import java.util.Arrays;
import java.util.Locale;

public class TestString {
    public static void main(String[] args) {
        //String对象的值    常量池中、堆中
//        String strOne = "ab";
//        String strTwo = "cd";
//        String strThree = "ab"+"cd";//存储在常量池中
//        String strFour = strOne+"cd";//等同于new关键字（字符串变量和常量进行拼接），对象存储在堆中
//        String strFive = "ab"+strTwo;//等同于new关键字（字符串变量和常量进行拼接），对象存储在堆中
//        String strSix = new String("abcd");//储存在堆中
//        String strSeven = "abcd";//存储在常量池中
//        //==比较两个对象在内存的地址是否一致
//        System.out.println(strThree == strFour);
//        System.out.println(strThree == strFive);
//        System.out.println(strThree == strSix);
//        System.out.println(strThree == strSeven);
//        System.out.println(strFour == strFive);



        //根据传入的索引值返回字符串中该索引对应的字段
//        String str = "asdjafgadfa";
//        System.out.println(str.charAt(3));


        //按照字典顺序比较两个字符串（返回一个整数， 负数 ， 0 ， 正数）
//        String strOne = "a";
//        String strTwo = "bcza";
//        int num = strOne.compareTo(strTwo);
//        int numOne = strTwo.compareTo(strOne);
//        System.out.println(num);
//        System.out.println(numOne);


        //把一个字符串拼接在原字符串的末尾
//        String str = "abc";
//        String strNew = str.concat("def");
//        System.out.println(strNew);



        //判断字符串中是否包含某个子字符串
//        String str = "西施、杨玉环、貂蝉、王昭君";
//        System.out.println(str.contains("杨玉环"));


        //判断字符串是否以指定的后缀名结尾
//        String str = "beauty.jpg";
//        System.out.println(str.endsWith(".jpg"));


        //判断字符串是否以指定的前缀开始
//        String name = "王二小";
//        System.out.println(name.startsWith("王"));


        //判断两个字符串内容（字符序列）是否相等
//        String strOne = "abc";
//        String strTwo = new String("abc");
//        System.out.println(strTwo == strOne);
//        System.out.println(strOne.equals(strTwo));


        //忽略大小写判断两个字符串是否相等
//          String strOne = "45Ha";
//          String strTwo = "45ha";
//        System.out.println(strOne.equalsIgnoreCase(strTwo));
//        System.out.println(strOne.equals(strTwo));



        //从左往右，根据传入的字符，返回该字符在字符串中第一次出现的索引，若字符串中没有该字符则返回-1
//        String str = "750848200@qq.com";
//        System.out.println(str.indexOf("@"));
//        System.out.println(str.indexOf("$"));



        //从右往左，根据传入的字符，返回该字符在字符串中第一次出现的索引，若字符串中没有该字符则返回-1
//        String str = "ab@asf@jak";
//        System.out.println(str.indexOf("@"));
//        System.out.println(str.lastIndexOf("@"));//索引都是从左往右


//        //把字符串转为字符数组
//        String str = "刘德华、张学友、黎明、郭富城";
//        char[] chars = str.toCharArray();
//        System.out.println(Arrays.toString(chars));
//        //把字符串根据指定的分隔符进行分割变为字符数组
//        String[] split = str.split("、");
//        System.out.println(Arrays.toString(split));



        //校验有效字符串 在控制台上输入一个字符串，判断该字符串是否为有效字符串
        //若校验的字符串中每个字符都属于小括号内的字符中，则该校验的字符串为有效字符串，
        //要求自定义方法
        //例如：asd123_是一个有效字符串 ，asd12#不是一个有效字符串‘


//        //返回字符串在常量池中的地址
//        String strOne = "abc";
//        String strTwo = new String("abc");
//        System.out.println(strOne==strTwo);
//        System.out.println(strOne==strTwo.intern());//intern返回字符串在常量池中的地址



//        //判断字符串是否为空字符串（字符串长度为0）
//        String str = "aaa";
//        String strOne = "";
//        System.out.println(strOne.isEmpty());
//        System.out.println(str.isEmpty());



//        //返回字符串的长度
//        String str = "aaa";
//        System.out.println(str.length());



//        //替换字符串
//        String strOne = "abcCCh";
//        String result =strOne.replace("C","c");
//        System.out.println(result);


//        //截取字符串(左闭右开)
//        String strOne = "abcdsf";
//        String result = strOne.substring(2,4);
//        System.out.println(result);
//        String resultOne = strOne.substring(1);
//        System.out.println(resultOne);



//        //把大写字符串转为小写字符串
//        String strOne = "ASDFGHJoooklj";
//        String lowerCase = strOne.toLowerCase();
//        System.out.println(lowerCase);
//        //把小写字符串转为大写字符串
//        String upperCase = strOne.toUpperCase();
//        System.out.println(upperCase);



//        //去除字符串的前后空格
//        String str = "       as   f    ";
//        System.out.println(str.length());
//        String result = str.trim();
//        System.out.println(result);
//        System.out.println(result.length());



        //把其他数据类型转为String类型
        System.out.println(String.valueOf(100));
        System.out.println(String.valueOf(100.12));



    }
}
