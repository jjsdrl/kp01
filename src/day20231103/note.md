1.Java中的常用类

```
java中包的作用：
	1.在java项目中，一般会把具有相同功能的类定义在同一个包中，方便管理
		商城项目：
			订单模块	控制层（Controller），业务层（Service），持久层（Dao） 订单模块相关的类都会在com.hw.order包中去定义
			用户模块	com.hw.user
			仓储模块	com.hw.storage
			会员积分模块	com.hw.vip
			......
	2.同一个包中不能创建两个同名的类，但在不同的包中可以创建同名的类
	3.同一个包中的两个类之间需要使用对方时，不需要导包
java中常用的包：
	java.util（Scanner）
	java.lang(该包中的所有类在使用时，都不需要导包，String类,Integer类......)
	java.sql......

object类：java中最小的细胞类，金字塔最顶端的类，java中所有类的超类（所有类直接或间接的父类）
	clone方法：返回一个对象（对象对应的类必须实现Cloneable接口）的副本，副本与原对象在内存中的地址不同的
	equals方法：判断两个对象是否相等
		equals和==比较方法的区别：
			1.==可以比较基本数据类型的变量，也可以比较引用数据类型的变量
				==比较基本数据类型，比较两个变量的值是否相等
				==比较引用数据类型，比较两个变量（对象）在内存中的地址是否相同
			2.equals方法只能比较引用数据类型，不能比较基本数据类型，若一个类的equals方法没有重写父类Object中的equals方法，则和Object类中equals方法比较的方式一致，都是比较两个对象在内存中的地址是否相等，若该类重写了equals方法，则按照重写的方法去进行比较
	hashCode方法：返回对象的哈希码值（是通过把对象在内存中的地址转换得到的一个整数）
	getClass方法：返回对象在程序运行过程中的类型（字节码对象--class类型）
	finalize方法：用于jvm虚拟机回收内存中的垃圾对象
				GC:garbage collection 垃圾回收机制
				当jvm虚拟机启动时，会在后台开启一个守护线程（GC），该线程会每隔一段时间去扫描jvm内存，把内存中的垃圾对象回收掉（调用的对象的finalize方法）
	
				垃圾对象：对一个对象没有更多的引用（变量名）指向它时，则该对象被称为垃圾对象
				Pig pig =new Pig() 该对象不是垃圾对象 有一个引用指向该对象
				Pig pigOne = pig	该对象不是垃圾对象 有两个引用指向该对象
				pig = null			该对象不是垃圾对象 有一个引用指向该对象
				pigOne = null		该对象是垃圾对象 没有引用指向该对象
				判断对象是否为垃圾对象，引用计数法（当一个对象的引用数量为0时，该对象为垃圾对象）
				垃圾回收算法：标记-清除算法，复制算法，标记-整理算法，分代收集算法
		notify，notifyAll，wait方法：使线程处于等待状态或者唤醒处于等待状态中的线程
		toString方法：返回对象的字符串表示形式
```

