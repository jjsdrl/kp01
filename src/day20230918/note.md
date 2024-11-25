1.java中的流程控制语句

```
分支结构：通过条件判断来控制程序的运行，选择哪些代码要执行，哪些代码不需要执行

	if...else：
		if（判断条件）{}
		if（判断条件）{}	else{}
		if（判断条件）{}	else if（判断条件）{}	......	else if（判断条件）{}	else{}
	switch:
		变量用来匹配case后面的值，匹配成功后，执行case后面的代码，执行完代码后，再执行break代码，break会中断（跳出）switch语句。若变量没有匹配到对应的case则执行default后面的代码
		变量的数据类型只能为：char，byte，short，int，Character，Byte，Short，Integer，String，enum（枚举）
		switch(变量){
			case 值1：代码块1；break；
			case 值2：代码块2；break；
			case 值3：代码块3；break；
			case 值4：代码块4；break；
			......
			default:代码块；break；
		}
```

