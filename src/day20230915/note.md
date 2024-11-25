1.java中的&& 和& 运算符的区别

```
1.相同点：&&和&都可以参与逻辑运算，结果一样
2.不同点：&&参与逻辑运算时具有短路功能，&不具备短路功能；||参与逻辑运算时具有短路功能，|不具备短路功能
		&和|可以做位运算（把两个十进制的数值转为二进制，按照二进制对应的位置进行计算）
```

2.java中的数据类型

```
基本数据类型：
	byte, shot , int , long , float , double , char , boolean
		整型：
			byte	1个字节	8bit	-2^7 ~ 2^7-1	-128 ~ 127
			shot	2个字节	16bit	-2^15 ~ 2^15-1	-32768 ~ 32767
			int		4个字节	32bit	-2^31 ~ 2^31-1
			long	8个字节	64bit	-2^63 ~ 2^63-1
		浮点型：
			float	4个字节	float > long
			double	8个字节	
		字符型：
			char	存储一个字符（一个汉字，一个字母）使用了unicode编码
					编码的发展史：ascii 美国人发明的 能够支持英文进行数据的传输 能表示128个字符（0-9，a-z，A-Z，+，-，……）
								unicode 能够存储全世界所有国家的文字（在0-127的代码范围内，ascii和unicode表示的字符是相同的）
								utf-8 gbk 
		布尔型：
			boolean	true/false
引用数据类型：class（类），interface（接口），enum（枚举），annotation（注释）
			class（类）：String，Scanner

```

3.java中不同的基本数据类型变量之间的计算原则

```
byte，shot，int，long，float，double，char，boolean（不能参与计算）
byte，shot，char，int四种数据类型的变量进行计算时，会先把自己的数据类型提升为int数据类型，再进行计算，计算的结果为int型
其他数据类型变量之间的计算按照取大原则（谁的数据类型更大，计算的结果就为该数据类型）
byte --- short  结果为int类型
byte --- float  结果为float类型
long --- float  结果为float类型
char --- double 结果为double类型
```

