1.java中的抽象类和抽象方法

```
抽象（abstract）
抽象类：用abstract关键词修饰的类就是抽象类
抽象方法：用abstract关键词修饰的方法就是抽象方法

背景：在继承中，我们知道子类可以继承父类中的属性和方法，当所有的子类都不满意从父类中继承过来的方法时，子类就会重写该方法，那么父类中定义的被重写的方法还需要有方法体吗？没有必要，可以把父类中的该方法定义为抽象方法，在java中，一个类中若存在抽象方法，则这个类必然是抽象类

抽象方法的特点：
	1.用abstract关键字修饰的 static，final关键字都不能与其结合使用
	2.抽象方法没有方法体（没有花括号）
	
抽象类的特点:
	1.用abstract关键字修饰的，
	2.定义抽象类的目的就是供子类继承抽象类，从而实现抽象类中的抽象方法。若子类没有实现该抽象方法，则子类也必须定义为抽象类，供子类去实现
	3.抽象类中可以有抽象方法，也可以没有抽象方法
	4.抽象类中有构造方法，但是不能被实例化
	5.若一个类中有抽象方法，则这个类必然为抽象类
```

2.java中的模板方法设计模式

```
模板方法设计模式：应用了多态的特性，抽象类，抽象方法    HibernateTemplate  jdbcTemplate  RedisTemplate
案例:计算一段代码的执行时间
public abstract class SuperCode {
    public abstract void executeCodeTime();
    public void calculateCodeTime(){
        long startTime = System.currentTimeMillis();
        executeCodeTime();
        long endTime = System.currentTimeMillis();
        System.out.println("代码执行所消耗的时间为"+(endTime-startTime)+"毫秒");

    }

}
class SonCodeOne extends SuperCode{
    @Override
    public void executeCodeTime(){
        for (int i=0 ; i<100000;i++){
            System.out.println(i+",");
        }
    }
}
class SonCodeOneTwo extends SuperCode{
    @Override
    public void executeCodeTime(){
        for (int i=0 ; i<10000;i++){
            System.out.println(i+",");
        }
    }
}
class Test{
    public static void main(String[] args) {
        SuperCode superCode = new SonCodeOne();
//        SuperCode superCode = new SonCodeOneTwo();
        superCode.calculateCodeTime();
    }
}
```

3.java中的单例设计模式

```
单例设计模式：能够保证在程序/系统的运行过程中，某个类的对象在内存中只有一个（单实例）
	1.构造方法私有化
	2.自身成为自身的静态属性
	3.提供一个外部类能够访问的获取该类对象的静态方法
	
	
	public class Student {
//    2.自身成为自身的静态属性
    private static Student student=null;
//    1.构造方法私有化
    private Student(){}

//	3.提供一个外部类能够访问的获取该类对象的静态方法
    public synchronized static Student getInstance(){
        if (student==null){
            student = new Student();
        }
        return student;
    }

}
```

