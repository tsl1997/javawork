package homeWork.no6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTester {
	public static void main(String[] args) {
		//1:数据
		List<String> str = new ArrayList<>();//创建集合、
		str.add("abc");//添加元素
		str.add("def");
		str.add("ooo");
		str.add("def");

		//2:逻辑、
		do {
			str.remove("def");//删除元素
		}while(str.contains("def"));//当查找内容存在时，继续删除

		//3:输出结果
		Iterator<String> it = str.iterator();//迭代器
		while(it.hasNext()){
			String s = it.next();
			System.out.println(s);//循环输出元素内容
		}

	}
}
