package demo.student;

import java.util.TreeSet;

public class TreeSetStudent {
	public static void main(String[] args) {
		TreeSet<Student> set = new TreeSet<>(new StudentComparable());//创建TreeSet集合
		set.add(new Student("李白",99));//添加对象元素
		set.add(new Student("韩信",89));
		set.add(new Student("张良",95));
		set.add(new Student("萧何",88));
		System.out.println(set);//打印集合

	}
}
