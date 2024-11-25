package day20231113;

public class TestStringBufferMethod {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("胡歌");
        //在StringBuffer对象的字符串末尾追加字符串
        System.out.println(sb.capacity());
        StringBuffer sbNew = sb.append("刘亦菲");
        System.out.println(sbNew==sb);
        System.out.println(sbNew);
        System.out.println(sb.toString());


        //返回当前容量
//        System.out.println(sb.capacity());

        //根据传入的起始索引和结束索引，删除对应的子字符串
//        sb.delete(0,3);
//        System.out.println(sb);

        //删除指定索引对应的字符
//        sb.deleteCharAt(2);
//        System.out.println(sb);

        //在指定的索引处插入字符串
//        sb.insert(2,"彭涛");
//        System.out.println(sb);

        //返回StringBuffer对象中字符串长度
//        System.out.println(sb.length());


        //根据传入的字符串，替换StringBuffer对象中指定的起始索引和结束索引对应的字符串
//        sb.replace(0,2,"蔡徐坤");
//        System.out.println(sb);

        //反转StringBuffer中的字符串
//        sb.reverse();
//        System.out.println(sb);

        //判断字符串是否为回文字符串
//        String sbOne ="abcba";
//        StringBuffer sbTwo = new StringBuffer(sbOne);
//        //用equals方法比较String对象和StringBuffer对象，类型不一样，直接返回false，需要把StringBuffer对象转为String对象（toString方法）
//        System.out.println(sbOne.equals(sbTwo.reverse().toString()));

        //替换指定索引处的字符
        sb.setCharAt(2,'李');
        System.out.println(sb);







    }
}