package day20231020;

import java.io.IOException;

public class A {
}
class HasStatic{
private static int x=100;
          public static void main(String args[ ]){
       HasStatic hs1=new HasStatic( );
        hs1.x++;
         HasStatic hs2=new HasStatic( );
        hs2.x++;
      hs1=new HasStatic( );
      hs1.x++;
        HasStatic.x--;
       System.out.println("x="+x);

      }
 }
//class AB{
//    public static void main(String [ ] args){
//        long i=0;
//        try{
//            i=Integer.parseInt(args[0]);
//        }catch(Exception e){ }
//
//        switch(i)
//        {case 0: System.out.println("0");
//            case 1: System.out.println("1");
//            default : System.out.println("default"); }
//    }
//}