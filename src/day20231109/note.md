1.java中的String类

```
String类：表示java中的字符串		线程安全的，不可变的字符序列
String类的常用方法:
	1.charAt:根据传入的索引值返回字符串中该索引对应的字段
	2.compareTo:按照字典顺序比较两个字符串（返回一个整数， 负数 ， 0 ， 正数）
	3.concat:把一个字符串拼接在原字符串的末尾
	4.contains:判断字符串中是否包含某个子字符串
	5.endsWith:判断字符串是否以指定的后缀名结尾
	6.startsWith:判断字符串是否以指定的前缀开始
	7.equals:判断两个字符串内容（字符序列）是否相等
	8.indexOf:从左往右，根据传入的字符，返回该字符在字符串中第一次出现的索引，若字符串中没有该字符则返回-1
	9.lastIndexOf:从右往左，根据传入的字符，返回该字符在字符串中第一次出现的索引，若字符串中没有该字符则返回-1
	10.toCharArray:把字符串转为字符数组
	11.split:把字符串根据指定的分隔符进行分割变为字符数组
	12.intern:返回字符串在常量池中的地址
	13.isEmpty:判断字符串是否为空字符串（字符串长度为0）
	14.length:返回字符串的长度
	15.replace:替换字符串
	16.substring:截取字符串(左闭右开)
	17.toLowerCase:把大写字符串转为小写字符串
	18.trim:去除字符串的前后空格
	19.valueOf:把其他数据类型转为String类型
	20.toUpperCase:把小写字符串转为大写字符串
	21.equalsIgnoreCase:忽略大小写判断两个字符串是否相等
	
```

2.java中的StringBuffer类

```
StringBuffer：线程安全的，可变的字符序列
	常用的方法：
	1.append:在StringBuffer对象的字符串末尾追加字符串
	2.capacity:返回当前容量
	3.delete:根据传入的起始索引和结束索引，删除对应的子字符串
	4.deleteCharAt:删除指定索引对应的字符
	5.insert:在指定的索引处插入字符串
	6.length:返回StringBuffer对象中字符串长度
	7.replace:根据传入的字符串，替换StringBuffer对象中指定的起始索引和结束索引对应的字符串
	8.reverse:反转StringBuffer中的字符串
	9.setCharAt:替换指定索引处的字符
```

3.java中的StringBuilder类

```
StringBuilder类：线程不安全的，可变的字符序列
	常用方法：参考StringBuffer类
```

4.String,StringBuffer,StringBulider

```
相同点：都可以用来存储字符串对象
不同点：
	1.String是不可变的字符序列，调用方法改变了字符串的值后会在内存中重新开辟一块空间，存储新的值
		StringBuffer和StingBuilder都是可变的字符序列，调用方法改变了字符串的值后会将新的值覆盖原地址中的值，不会开辟新的内存空间
	2.String和StringBuffer都是线程安全的，StringBuilder是线程不安全的（不考虑多线程并发的情况下，使用StringBuilder效率更高）
```

