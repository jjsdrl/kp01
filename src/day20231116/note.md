1.java中的集合

```
数据结构：堆，栈，队列，树，图，向量......
背景：存储数据的方式
	1.变量	只能存储一个值（对象）
	2.数组	可以存储多个值（对象），数组一旦定义了初始长度，则不能再改变，意味着数组只能存储固定个数的元素。而且数组的类型再声明的时候就已经固定了
	3.集合	可以存储无限个值（对象），对象的数据类型也可以是任意的数据类型
	
单列存储的集合：collection接口（定义集合的规范，存储数据的方式，操作数据的方式）
	collection子接口：List接口，Set接口
		List接口：存储的元素是有序的，可以重复的
			实现类：
				ArrayList：List接口的数组实现方式（是一个集合对象，底层是通过数组来存储一个个对象的）
				泛型：泛型决定了集合中存储数据的数据类型
					作用：
						1.能够避免进行类型的转换
						2.能够提高程序的运行效率
					泛型的使用场景：
						1.接口的泛型 Interface Comparable<T>	Interface List<E>
							class Dog implements Comparable<Dog>{
    							@Override
    							public int compareTo(Dog o) {
       		 						return 0;
    							}
							}
						2.类的泛型 ArrayList<E>
							class Persson<T>{
                                String name;
                                //养一只宠物（猫，狗，猪）
                                T animal;
                                public Persson(){

                                }

                                public Persson(String name,T animal) {
                                    this.name = name;
                                    this.animal = animal;
                                }

                                @Override
                                public String toString() {
                                    return "Persson{" +
                                            "name='" + name + '\'' +
                                            ", animal=" + animal +
                                            '}';
                                }
                            }
                         3.方法的泛型 
                         	public static <T> void calculate(T t ){
        					System.out.println(t);
    					}
    					4.泛型的上限和下限
    						    //泛型的上限 ?的类型只能是Number或者Number类型的子类
                            public static void addExtends(Collection<? extends Number> collection){

                            }

                            //泛型的下限 ?的类型只能是Integer或者Integer类型的父类
                            public  static void addSuper(Collection<? super Integer> collection){

                            }

				
		Set接口：存储的元素是无序的，不可以重复的
		
		
双列存储的集合：
	
```

2.java中List集合接口的实现类ArrayList

```
ArrayList实现类：
	特征：有序的，可重复的，可以存储null，线程不安全的，底层实现的方式是数组
		常用方法：
			1.add:向集合中添加元素
			2.addAll:向集合中再添加一个集合
			3.forEach:遍历集合
			4.clear:删除掉集合中的所有元素
			5.size:返回集合中元素的个数
			6.get:根据传入的下标，返回该下标在集合中的元素
			7.contains:判断集合中是否包含某一个元素
			8.iterator:返回一个迭代器，迭代器中存储了集合中的所有元素
				/*Iterator<String> it = list.iterator();
        			//it.hasNext()判断是否有下一个元素	
        			while (it.hasNext()){
            		String str = it.next();
            		System.out.println(str);
        			}*/
            9.indexOf:判断指定元素在集合中的下标，若集合中不存在该元素，返回-1
            10.isEmpty:判断集合中是否存在元素
            11.remove：从集合中移除元素
            12.toString：把集合转为Object类型的数组
            13.removeAll：从集合中删除包含指定集合中的元素
            14.retainAll：从集合中保留指定集合中的元素，其他元素都删除
            15.set：替换集合中指定下标位置上的元素
            16.subList：截取集合中指定位置的子集和（左闭右开）
```

3.java中List集合接口的实现类LinkedList

```
LinkedList实现类：
	特征：有序，可重复的，可以存储null，线程不安全的，底层实现方式是双链表
	常用的方法：
		1.addFirst：在集合的头部添加元素
		2.addLast：在集合的尾部添加元素
		3.peek：检索但不删除此列表的头（第一个元素）
		4.poll：检索并删除此列表的头（第一个元素）
		......
		其他方法参照ArrayList实现类
```

4.java中List接口的实现类Vector

```
Vector实现类：
	特征：有序，可重复的，可以存储null，线程安全的，底层实现方式是数组
	常用方法：
		1.addElement：在集合的尾部添加元素
		2.trimToSize：把集合的容量设置为集合中元素的个数（释放一部分的内存空间）
		3.capacity：返回集合中的容量
```

5.java集合中的Set接口及其实现类

```
Set接口：
	特征：不允许存储重复的元素，可以存储null（但只能存储一个null）
	实现类：
		HashSet
		TreeSet
		LinkedHashSet
```

6.java中Set接口的实现类HashSet

```
HashSet实现类：
	特征：不允许存储重复的元素，可以存储null（但只能存储一个null），无序的，底层是通过HashMap来实现的（哈希表/散列表）
	判断两个对象是否是重复的对象：通过equals方法比较两个对象是否是重复的对象（jdk建议研发人员重写了equals方法则必须要重写HashCode方法，确保两个对象是重复的，则这两个对象的hash值也相同）
	1.add：向集合中添加元素
	2.size：返回集合中元素的个数
	3.iterator：返回迭代器，迭代器中存储了集合中的所有元素
		iterator.hasnext	判断迭代器中是否有下一个元素
		iterator.next		返回迭代器中游标当前指向元素
	4.forEach:遍历集合
	5.contains：判断集合中是否包含某个元素
	6.remove：移除集合中的元素
	7.addAll：向集合中在添加一个集合
	8.removeIf:从集合中删除满足条件的元素
	9.toArray：把集合转为Object类型的数组
```

7.java中Set接口的实现类TreeSet

```
TreeSet实现类：
	特征：不允许存储重复的元素，不可以存储null，有序的，底层是通过TreeMap来实现的（二叉树）
	常用方法：
		1.add：向集合中添加元素
		2.forEach：遍历集合
		3.ceiling：返回集合中大于或等于给定元素的最小元素（根据排序的前后顺序来确定大小，排在后面的就大，排在前面的就小）
		4.first：获取集合中的第一个元素
		5.last：获取集合中的最后一个元素
		6.remove：删除集合中的某个元素
		7.subSet：根据起始元素对象以及结束元素对象来截取集合中的部分元素(左闭右开原则)
```

8.java中的Map接口及其实现类

```
Map：存储的是一对键值对数据（key —— value） Husband - wife
	特征：键不能重复，值可以重复（equals方法判断是否重复）
	实现类：
		1.HashMap
		2.HashTable
		3.TreeMap
```

9.java中的Map接口的实现类HashMap

```
HashMap实现类：
	特征：无序的，键不能重复，值可以重复，并允许存储null值和null键，线程不安全的，底层是基于哈希表来实现的
	常用的方法：
		1.put：向集合中添加键值对数据
		2.get：过传入指定的键，来获取Map集合中对应的值
		3.forEach：把map中的键值对数据遍历出来（通过lambda表达式来遍历）
		4.keySet:把Map集合中所有的key存入到一个set集合中
		5.entrySet:把Map集合中所有的键值对数据存入到一个set集合中
        		   Map.Entry<String, String>是Node类型（存储的是键值对的数据）实现的接口
        6.values:把Map集合中所有的值数据存入到一个Collection集合中
        7.clear:清除集合中的所有数据
        8.containsKey:判断集合中是否包含指定的键
        9.containsValue:判断集合中是否包含指定的值
        10.isEmpty:判断集合中的元素（一条键值对数据）个数是否为0
        11.remove:从Map集合中根据传入的key来移除对应的键值对数据
        12.size:返回集合中元素的个数
        13.replace:根据传入的key和value来替换Map集合中该key所对应的value
```

10.java中Map接口的实现类HashTable

```
HashTable实现类：
	特征：无序的，键不能重复，值可以重复，不允许null值和null键，线程安全的，底层是基于哈希表来实现的
	常用方法：
		参照HashMap类......
```

11.java中Map接口的实现类TreeMap

```
TreeMap实现类：
	特征：有序的，键不能重复，值可以重复，允许null值但不允许null键，线程不安全，底层是基于二叉树来实现的
	常用方法：
		1.put:向集合中添加键值对数据
		2.get:通过传入的key获取集合中该key对应的value
		3.keySet：把map集合中的所有key存储到Set集合中，再遍历Set集合（map.get（key））达到遍历map的功能
		4.entrySet:把map集合中的所有key-value键值对数据存储到Set集合中（set<Map.Entry>）,再遍历Set集合（Map.Entry对象具有getKey，getValue方法）达到遍历map功能
		5.forEach：把map中所有的键值对数据遍历出来（通过Lambda表达式）
		6.Values：把map中所有的value值存储到collection集合中
		7.clear:清除集合中的所有数据
        8.containsKey:判断集合中是否包含指定的键
        9.containsValue:判断集合中是否包含指定的值
        10.isEmpty:判断集合中的元素（一条键值对数据）个数是否为0
        11.remove:从Map集合中根据传入的key来移除对应的键值对数据
        12.size:返回集合中元素的个数
        13.replace:根据传入的key和value来替换Map集合中该key所对应的value
```

12.java中的集合总结

```
单列存储集合：
	Collection接口：List，Set子接口
		List：存储有序，可重复的元素，允许存储null
			ArrayList：有序，可重复的元素，允许存储null，线程不安全，底层是通过数组的方式来实现的（若经常查询集合中的数据库时，效率较高）
				List list = Collections.synchronizedList(new ArrayList(...)); 能够保证线程安全
			LinkedList：有序，可重复的元素，允许存储null，线程不安全，底层是通过双链表的方式来实现的（若经常添加删除数据时，效率较高）
				List list = Collections.synchronizedList(new LinkedList(...)); 能够保证线程安全
			Vector：有序，可重复的元素，允许存储null，线程安全，底层是通过数组的方式来实现的（若经常查询集合中的数据库时，效率较高）
		List集合的遍历方式：
			1.for-i循环，通过下标来进行遍历
			2.for-each循环来进行遍历
			3.forEach函数来进行遍历
			4.迭代器来进行遍历
				Iterator it = list.iterator();
				while (it.hasNext()){
            		String str = it.next();
            		System.out.println(str);
        			}
		Set:不允许存储重复的元素（通过equals方法来判断两个元素是否重复）
			HashSet：无序，不可重复，允许存储null（只能有一个），线程不安全，底层是通过HashMap（哈希表）来实现的
				Set s = Collections.synchronizedSet(new HashSet(...)); 能够保证线程安全
			TreeSet：有序，不可重复，不允许存储null，线程不安全，底层是通过TreeMap（二叉树）来实现的
				SortedSet s = Collections.synchronizedSortedSet(new TreeSet(...)); 能够保证线程安全
				注意：存入的元素必须要能够排序（1.存入的元素类型实现Comparable接口，从而实现CompareTo方法
										2.构造出TreeSet对象时传入比较顺序的函数/规则）
			LinkedHashSet：有序的，是HashSet的子类，允许存储null（只能有一个），线程不安全，底层是通过LinkedHashMap来实现的
		Set集合的遍历方式：
		1.for-each循环来进行遍历
		2.forEach函数来进行遍历
		3.迭代器来进行遍历
				Iterator it = list.iterator();
				while (it.hasNext()){
            		String str = it.next();
            		System.out.println(str);
        			}6
双列存储集合：
	Map:存储的为键值对的数据（key-value）,存储的键不能重复
		HashMap：无序的，键不能重复，值可以重复，允许存储null值和null键（只能有一个），线程不安全的，底层是基于哈希表来实现的
			Map m = Collections.synchronizedMap(new HashMap(...)); 能够保证线程安全
		HashTable：无序的，键不能重复，值可以重复，不允许null值和null键，线程安全的，建议在并发的场景下（考虑线程安全）使用ConcurrentHashMap来替代HashTable底层是基于哈希表来实现的
		TreeMap：有序的，键不能重复，值可以重复，允许null值但不允许null键，线程不安全，底层是基于二叉树来实现的
			SortedMap m = Collections.synchronizedSortedMap(new TreeMap(...)); 能够保证线程安全
			
	Map集合的遍历方式：
		1.keySet方法，把map中的所有key存储到Set集合中，再通过遍历Set集合获取所有的key，然后调用map.get(key)方法获取该key对应的value值
		2.entrySet方法，把map中的所有key-value键值对数据存储到Set集合中，再通过遍历Set集合获取所有的键值对数据（Map.Entry接口类型），然后调用Map.Entry接口类型的getKey（）方法获取键，调用getValue（）方法获取值
		3.forEach函数来进行遍历（Lambda表达式）
		4.调用map.values()方法获取map的所有value值
```

