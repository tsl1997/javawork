package demo;

import org.junit.Test;

import java.util.*;

/**这是预习集合*/
public class CollectionTester {
	@Test //创建一个Collection类型对象
	public void testNew(){
		Collection c= new ArrayList();//多态创建一个ArrayList对象
		c.add("南小鸟");
		c.add("柯南");
		boolean a = c.contains("柯南");//contain包含 True
		System.out.println(a);
		boolean b = c.remove("南小鸟");//remove消除 True
		System.out.println(b);
		int size = c.size();//size尺寸 获取元素个数
		System.out.println(size);
		System.out.println(c);//[柯南]
	}

	@Test //测试删除方法
	public void testClear(){
		Collection c= new ArrayList();//多态创建一个ArrayList对象
		c.add("南小鸟");
		c.add(58);
		System.out.println(c);
		c.clear();//clear消除 清除所有元素
		System.out.println(c);
	}

	@Test //Collection遍历
	public void testFor(){
		Collection c = new ArrayList();
		c.add("安其拉");
		c.add("王昭君");
		c.add("孙尚香");
		ArrayList all = (ArrayList)c;//强制向下转型，使用子类特有方法get
		for(int i=0;i<all.size();i++){
			Object o = all.get(i);//获取内容赋值给o
			System.out.println(o);
		}
	}

	@Test //迭代器遍历
	public void testIterator(){
		Collection c = new ArrayList();
		c.add("安其拉");
		c.add("王昭君");
		c.add("孙尚香");
		Iterator it = c.iterator();//iterator迭代器
		while(it.hasNext()){
			Object o = it.next();//取出当前元素
			System.out.println(o);
		}
		//增强for遍历
		for(Object o:c){
			System.out.println(o);
		}
	}

	@Test //尝试用Object代替int进行数组遍历
	public void testObject(){
		int[] arr={1,2,3};
		for(Object o:arr){
			System.out.println(o);
		}
	}

	@Test //泛型 创建时定义传入类型
	public void testFan(){
		Collection<String> c = new ArrayList<String>();//集合上面使用泛型
		c.add("江小白");
		//c.add(156);//这里报错，因为泛型规定了传入类型
		for(Object o:c){
			String o1 = (String) o;//强制类型转换
			System.out.println(o1.length());
		}
	}

	@Test //方法上使用泛型，传参和返回类型更加灵活
	public void tstFangFaFan(){
		TestFangFa t = new TestFangFa();//创建一个方法泛型的对象
		t.method("abc");
		t.method(12);
		String a1 = t.toMethod("我喜欢你");//测试传入不同的参数
		Integer a2 = t.toMethod(520);
		Boolean a3 = t.toMethod(true);
		double[] a4 = t.toMethod(new double[]{3.14, 6.66, 5.21});
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		for(Object o:a4){
			System.out.println(o);
		}
	}
	//当接口上使用泛型时：
	//1：在方法调用是，传入参数确定泛型的具体类型
	//2：构造方法时，使用具体类型来确定泛型，在方法名和()之间加入<类型>即可
	//如：Son<String> s=new son<String>();

	@Test//增强for在底层使用迭代器 迭代器泛型
	public void testIteratorFan(){
		Collection<String> str = new ArrayList<>();
		str.add("陶子仪");
		str.add("12");
		str.add("野比大雄");
		Iterator<String> it = str.iterator();//创建一个迭代器，使用泛型
		while (it.hasNext()){
			String s = it.next();
			System.out.println(s);
		}
	}

	@Test //自定义类型，集合泛型的进一步使用
	public  void testFanDIY(){
		ArrayList<Student> a = new ArrayList<>();//创建对象
		Student h = new Student("亨伯特", 35);//创建学生对象
		Student l = new Student("Lolita", 18);
		a.add(h);//添加学生对象
		a.add(l);
		for(int i=0;i<a.size();i++){
			Student stu = a.get(i);//获取固定位置的元素
			String name = stu.getName();
			int age = stu.getAge();
			StringBuilder str = new StringBuilder();
			str.append(name).append("\t").append(age);//拼接字符串
			System.out.println(str);//打印输出
		}
	}

	@Test //Linked 预习
	public void testLinked(){
		LinkedList<String> str = new LinkedList<>();//创建链表对象
		str.add("林黛玉");//林黛玉
		str.addFirst("薛宝钗");//薛宝钗，林黛玉
		str.addLast("妙玉");//薛宝钗，林黛玉，妙玉
		System.out.println(str.getFirst());//取表头，不删除数据
		System.out.println(str);
		System.out.println(str.removeLast());//取表尾，删除数据
		System.out.println(str);
	}

	@Test //set接口
	public void test(){
		HashSet<String> hs = new HashSet<>();
		hs.add("逢魔时王");
		hs.add("异魔神");
		hs.add("小明");





	}



















}
