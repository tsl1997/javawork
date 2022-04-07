package classJob;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
	@Test
	public void test(){
		List<Integer> stuAge = new ArrayList<>();//创建学生年龄
		stuAge.add(12);
		stuAge.add(13);
		stuAge.add(14);
		Iterator<Integer> it = stuAge.iterator();//获取迭代器
		double sumAge=0;//年龄求和
		int maxAge=0;//年龄最大值，最小值同理
		while(it.hasNext()){//迭代判断
			Integer tempAge = it.next();//取出遍历年龄
			sumAge+=tempAge;//累计求和
			if(tempAge>maxAge){
				maxAge=tempAge;//保存最大值
			}
		}
		System.out.println("学生年龄和是："+sumAge);
		System.out.println("学生平均年龄是："+sumAge/stuAge.size());
		System.out.println("学生最大年龄是："+maxAge);
	}

	@Test
	public void test2() {
		List<Integer> stuAge = new ArrayList<>();//创建学生年龄
		stuAge.add(12);
		stuAge.add(13);
		stuAge.add(14);
		double sumAge=0;//年龄求和
		int maxAge=0;//年龄最大值，最小值同理
		for(Integer s:stuAge){//增强for
			sumAge+=s;//求和，Integer自动拆箱int
			if(maxAge<s){
				maxAge=s;//保存最大值
			}
		}
		System.out.println("学生年龄和是："+sumAge);
		System.out.println("学生平均年龄是："+sumAge/stuAge.size());
		System.out.println("学生最大年龄是："+maxAge);
	}

	@Test
	public void test3() {
		List<Student> stu = new ArrayList<>();//创建列表
		stu.add(new Student(1,"东霓","123"));//添加元素
		stu.add(new Student(2,"西决","123"));
		stu.add(new Student(3,"南音","123"));
		boolean a = stu.contains(new Student(1, "东霓", "123"));//查找元素
		System.out.println(a);
		boolean b = stu.remove(new Student(1, "东霓", "123"));//删除元素
		System.out.println(b);
		System.out.println(stu);//打印列表
	}
}
