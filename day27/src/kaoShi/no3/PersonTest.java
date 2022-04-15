package kaoShi.no3;

import java.util.HashSet;

public class PersonTest {
	public static void main(String[] args) {
		HashSet<Person> set = new HashSet<>();//创建集合
		Person p1 = new Person("刘诗诗", 26);//创建对象
		Person p2 = new Person("赵丽颖", 18);
		Person p3 = new Person("刘诗诗", 19);
		set.add(p1);//添加对象元素
		set.add(p2);
		set.add(p3);//当姓名重复时，添加失败
		System.out.println(set);//打印集合
	}
}
