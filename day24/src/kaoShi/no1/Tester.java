package kaoShi.no1;

import java.util.ArrayList;
import java.util.Iterator;

public class Tester {
	public static void main(String[] args) {
		/*1. 使用ArrayList集合，对其添加100个不同的元素：
		1.使用add()方法将元素添加到ArrayList集合对象中；*/
		ArrayList<Integer> list = new ArrayList<>();//创建集合
		for(int i=1;i<=100;i++){
			list.add(i);//添加100个元素
		}
		/*2.调用集合的iterator()方法获得Iterator对象，并调用Iterator的hasNext()和next()方法，
	    迭代的读取集合中的每个元素；*/
		Iterator<Integer> it = list.iterator();//迭代器
		while(it.hasNext()){
			System.out.println(it.next());//打印每个元素
		}
		/*3.调用get()方法先后读取索引位置为50和102的元素，要求使用try-catch结构处理下标越界异常；*/
		int num1=50;
		System.out.println("下标"+num1+"的元素是：");
		System.out.println(list.get(num1));
		try {
			int num2=102;
			System.out.println("下标"+num2+"的元素是：");
			System.out.println(list.get(num2));
		} catch (IndexOutOfBoundsException e) {
			System.err.println("下标越界！");//捕获宜昌后输出该语句
		}

	}
}
