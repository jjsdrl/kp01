1.java中的时间类Date

```
Date类：Date类代表了一个特定的时间，以毫秒作为精度

        //获取当前的系统时间
        Date time = new Date();
        System.out.println(time);

        //获取年份
        System.out.println(time.getYear()+1900);

        //获取月份
        System.out.println(time.getMonth()+1);

        //获取日期
        System.out.println(time.getDate());

        //获取小时
        System.out.println(time.getHours());

        //获取分钟
        System.out.println(time.getMinutes());

        //获取秒
        System.out.println(time.getSeconds());

        //获取当前系统时间距离1970-01-01 00：00：00所经历的毫秒数
        System.out.println(time.getTime());
```

2.java中字符串时间和Date类型时间之间的相互转换

```
TestSimpleDateFormat类：简单时间转换类（转换的字符串时间格式必须和该类构造方法中声明的时间一致，否则转换时会抛异常）
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM-dd HH:mm:ss");
        //把Data类型的时间转为String类型的时间
        String strTime = sdf.format(time);
        System.out.println(strTime);
        //把String类型的时间转为Data类型的时间
        String strTime = "2008/01-10 12:12:12";
        Date date = sdf.parse(strTime);
        System.out.println(date);
```

3.java中的Calendar类

```
Calendar类：日历类
	常用方法：
		//父类接收子类对象
        Calendar calendar = Calendar.getInstance();
        //获取年份
        System.out.println(calendar.get(calendar.YEAR));
        //获取月份
        System.out.println(calendar.get(calendar.MONTH));
        //获取日期
        System.out.println(calendar.get(calendar.DATE));
        System.out.println(calendar.get(calendar.DAY_OF_MONTH));
        //获取小时
        System.out.println(calendar.get(calendar.HOUR));
        System.out.println(calendar.get(calendar.HOUR_OF_DAY));
        //获取分钟
        System.out.println(calendar.get(calendar.MINUTE));
        //获取秒
        System.out.println(calendar.get(calendar.SECOND));
        
java8新的时间api：
		//获取年月日
        System.out.println(LocalDate.now());
        //获取时分秒
        System.out.println(LocalTime.now());
        //获取年月日 时分秒
        System.out.println(LocalDateTime.now());
	
```

4.java中的System,Arrays,Scanner类

```
Scanner类：文本扫描器，能够扫描用户在控制台中输入的数据
	构造方法：Scanner scanner = new Scanner(System.in);
		System.in代表标准的输入流类型（InputerStream 输入流）
	常用的方法：
		1.hasNext：判断扫描器扫到的值是否为一个字符串，如果是字符串，则返回true
		2.hasNextFloat
		3.hasNextDouble
		......
		4.next:返回扫描器扫描到的字符串
		5.nextFloat:返回扫描器扫描到的浮点型数据
		......
		hasNextInt结合nextInt方法一起使用
		//hasNext（）判断输入的值是否为整数
        if (scanner.hasNextInt()){
            //nextInt()用来获取整个整数
            int num = scanner.nextInt();
            System.out.println("是整数");
        }else {
            System.out.println("不是整数");
        }
     
System类:系统类
	常用的方法：
		1.arraycopy:数组的复制
		2.currenTimeMillis：获取当前时间的毫秒数
		3.exit：退出系统（当值为0时，正常退出系统）
		4.gc：运行垃圾回收器
		5.getProperties：获取系统的所有属性，例如配置的环境变量信息等

Arrays类：数组类
	常用的方法：
		1.binarySearch：二分查找（给定一个有序的数组，查找指定值在数组中的下标）
		2.copyOf：复制数组
		3.copyOfRange：复制数组中的某一段
		4.sort：对数组进行排序
		5.toString：把数组中的值进行遍历
```

