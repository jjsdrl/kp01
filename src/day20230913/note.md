1.什么是软件？

```
软件是按照特定顺序组合的一系列指令和数据的集合

案例：在控制台上打印出HelloWorld字符串   指令：打印  数据：HelloWorld字符串

系统软件：windows操作系统，Linux操作系统，MacOS操作系统，鸿蒙操作系统

应用软件：
	BS架构：Browser-Server 通过浏览器和服务器进行交互  淘宝，天猫，京东，新浪......
	CS架构：Client-Server 通过客户端和服务器进行交互 英雄联盟，王者荣耀，绝地求生......
	
```

2.计算机语言有哪些？

```
机器语言：只能够识别二进制（满二进一）的数据  00000011 1*2^0+1*2^1+0*2^2+...... ==>  3

汇编语言：VB计算机能够识别简单的字符

高级语言：计算机能够识别一些英文单词了（if while switch case break continue）
		java:作为服务器端应用程序开发的语言 大型的电商网站，金融系统，医疗系统，电力系统
		c语言：嵌入式应用程序的开发（在硬件中嵌入c语言编写的程序，使得可以通过程序控制硬件） 声控灯，操作系统
		c++：开发游戏（捕鱼达人），数据传输功能强大
		c#：开发网站					
		python：人工智能，数据可视化，神经网络，网站，爬虫
```

3.java语言的发展历程

```
1995：java语言诞生（Sun公司）
1996：jdk1.0发布  jdk（java development kit） java开发工具包
2004：jdk1.5发布  java5
2009：Sun公司被Oracle公司收购了 
2014：java8发布  Lambda表达式，函数式编程  开发效率大大提升，程序运行的性能也得到了提升
......
java20

java8,java11,java17三个版本是稳定版本，承诺长期进行维护的

java的三大平台：
	javaSE：标准版 规范了java语言语法的使用，提供了基本的类库
	javaEE：企业版 提供了开发网站相关的技术  jsp，Servlet，tomcat
	javaME：微型版 开发移动端的应用程序  app  uni-app
```

4.java开发环境的搭建（安装jdk）

```
jdk的安装：jdk和jre安装在同一个目录下

环境变量的配置：
	1) 新建系统变量JAVA_HOME，输入“变量值”为你安装的JDK地址，如：C:\Program Files\Java\jdk1.8.0_231
	2) 在系统变量区域，选择"新建按钮"输入"变量名"为CLASSPATH,输入"变量值"为.;%JAVA_HOME%\lib;%JAVA_HOME%\lib\tool.jar
	3) 在系统变量区域，选择Path,点击下面的编辑按钮，在弹出的框中选择新建添加2行，一行输入%JAVA_HOME%\bin
	4) 在命令提示符中输入java -version 查询当前安装的jdk版本
	5) 在命令提示符中输入javac -version 查询当前安装的javac版本

java语言编程的程序是跨平台的：一次编写，处处运行（在不同的操作系统上都能运行），因为有JVM（java虚拟机），把java源码经过编译之后的.class后缀名的字节码文件解释成对应的操作系统能够识别的文件，从而可以在对应的操作系统上正常运行
	结论：需要在不同的操作系统上安装与之对应的jdk
```

5.jdk，jre，jvm三者之间的关系

```
jdk(java development kit):java开发工具包
jre(java runtime environment):java运行环境
jvm(java virtual machine):java虚拟机

jdk包含了jre，jre包含了jvm
jdk = java可执行命令+jre  java可执行命令：javac java javadoc jar
jre = java类库+jvm      java类库：Scanner类型 String类型
```

**6**.java中的注释

```
/**  */  文档注释 
/* */	多行注释
//		单行注释
java 	解释器
javac	编译器
javadoc	把java源程序生成为api文档 api（application interface）描述类中的属性和方法
```

**7**.java中的关键字和保留字

```
关键字：package，static，public，provate，String
保留字：const，goto......
```

