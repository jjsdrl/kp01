1.java中的Math类

```
Math类:提供了很多数学中的运算表达式
常用的属性：
	1.E
	2.PI
常用的方法：
	1.abs：取绝对值
	2.cos：余弦
	3.toRadians：将以度为单位的角度转换为以弧度测量大致相等的角度
		Math.cos(Math.toRadians(45))  0.7......
	4.ceil：向上取整(返回一个比该数值大的最近的整数)
       	Math.ceil(12.2);
	5.floor：向下取整(返回一个比该数值小的最近的整数)
       	Math.floor(-12.2);
	6.round：四舍五入
      	Math.round(12.3);
       	Math.round(12.6);
	7.log/log10：取对数   以e（Math.E）为底的对数
       	Math.log(Math.E * Math.E);
       	Math.log10(100);
	8.pow：计算指数
        Math.pow(2, 4);
	9.max：计算两个数中的最大值
     	Math.max(100, 200);
	10.min：计算两个数中的最小值
       	Math.min(100, 200);
	11.sqrt：开平方根
      	Math.sqrt(16);
     12.radom获取一个随机数[0,1)
     	获取一个1-100之间的随机整数
	    Math.floor(Math.random()*100)+1;
```

