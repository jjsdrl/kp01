1.java中八大基本数据类型的包装类

```
基本数据类型的包装类:
	1.java是一门面向对象的编程语言，但int， float都不是类，不符合面向对象的特征，为了使java语言更加面向对象，因此就设计了八大基本数据类型的包装类
	2.包装类提供了很多操作基本数据类型的方法及属性 Integer .MAX_VALUE int 类型的最大值 Integer .parseInt
byte		Byte
Short		Short
int			Integer
long		Long
float		Float
double		Double
char		Charater
boolean		Boolean

自动装箱（把基本数据类型转为对应的包装类）和自动装箱（把包装类转为基本数据类型）
	把byte类型的数据自动转换为了Byte类型
			  把int类型的数据自动转换为了Integer类型
               Integer numOne = 100;
               把Integer类型的数据自动转换为了int类型
               int numTwo  = numOne;
Integer类：
	常用方法：
		1.byteValue，longValue，intValue，shoutValue..... 把Integer对象转为其他基本数据类型
		2.ToString	把Integer对象转为String类型
		3.valueOf	把String对象转为Integer类型
		4.pareseInt	把String对象转为int类型
		
	享元设计模式：
		Integer a = 300;
        Integer b = 300;
        Integer c = 100;
        Integer d = 100;

        //享元模式 减少内存占用 提高性能 -128 ~ 127
        System.out.println(a == b);		false
        System.out.println(c == d);		true
        
 Character类：
 	常用方法：
 		1.isDigit：判断字符是否为数值
 		2.isLetter：判断字符是否为字母
 		3.isLowerCase：判断字符是否为小写字母
 		4.isUpperCase：判断字符是否为大写字母
 		5.isLetterDigit：判断字符是否为字母或者数字
 		6.toLowerCase：把字符转为小写字符
 		4.toUpperCase：把字符转为大写字符
```

