package day20231019;

public class TestOverload {
    public void eat(){
        System.out.println("进行光合作用！！！");
    }

    public void eat(double money){
        System.out.println("吃红烧肉！！！");
    }


    public void eat(String food){
         System.out.println("吃"+food+"！！！");
    }

    public void eat(int arg0ne,String argTwo){

    }

    public void eat(String arg0ne,int argTwo){

    }


}
