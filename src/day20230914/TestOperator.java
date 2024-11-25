package day20230914;

public class TestOperator {
    public static void main(String[] args) {
//        System.out.print("王昭君\n");
//        System.out.print("\t西施\n");
//        System.out.print("貂蝉\n");
//        System.out.print("杨玉\t环\n");
//        System.out.println(10%3);
//        System.out.println(10/3);
//        System.out.println(10+3);
//        System.out.println(10+"3");

//        int num = 5;
        //num++ 先打印num的值,再num变量做自增操作（自增，在自己原有值的基础上加1）
        //++num 先执行num自增,再把num自增后的值打印出来
//        System.out.println(num++);
//        System.out.println("num++后num的值为"+num);
//        System.out.println(++num);
//        System.out.println(--num);
//        System.out.println("--num后num的值为"+num);
//        System.out.println(num--);
//        System.out.println("num--后num的值为"+num);
//        System.out.println(num+++num---num);
//        System.out.println(num++ + num-- - num);
//        System.out.println(num++ + num- --num);
//        System.out.println(num+ ++num - --num);
        /*
        *  (num++)    +     (num--)    -     num
        *      5      +        6       -      5
        *          num = 6          num = 5
        * */
//        int num = 7;
//        System.out.println(2*++num-num+num--);

//        System.out.println(2 == 3);
//        int num = 10;
//        System.out.println(num += 2);
//        System.out.println( 3 > 2 && 1 < 0);
//        System.out.println( 3 > 2 || 1 < 0);
//        System.out.println( !(3 > 2));
//        System.out.println( 3 & 5 );
        /*
        * 00000011
        * 00000101    & 对应位置上的值都为1，对应结果位置上的值才为1
        * ------------------
        * 00000001
        *
        * */


//        System.out.println( 3 | 5 );
        /*
         * 00000011
         * 00000101    | 对应位置上的值有一个值为1，对应结果位置上的值就为1
         * ------------------
         * 00000111
         *
         * */
        
//        System.out.println( 4 << 2);
        /*
        * 00000100              << 4*2^2
        * -------------------
        * 00010000
        *
        * */

//        System.out.println( 32 >> 2);
        /*
         * 00100000              >> 4/2^2
         * -------------------
         * 00001000
         *
         * */

//        System.out.println( 3 ^ 5 );
        /*
        * 00000011
        * 00000101              ^ 对应位置上相同为0不同为1
        * --------------------
        * 00000110
        * */

//        System.out.println( 3 ^ 5 ^ 5);


//        System.out.println(3>2?true:false);
//        String userName = null;
        String userName = "王滋味";
        System.out.println(userName == null ? "没取名字" : userName);

    }
}
