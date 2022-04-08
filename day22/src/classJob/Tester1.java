package classJob;

import java.util.HashSet;

public class Tester1 {
	public static void main(String[] args) {
		String demo="aaaaaBBBBB111   我我我";//定义字符串
		char[] chars = demo.toCharArray();//转化为字符串数组
		HashSet<Character> set = new HashSet<>();//创建集合
		for(Character c:chars){
			set.add(c);//添加元素，过滤重复元素
		}
		System.out.println(set);//打印输出
	}
}
