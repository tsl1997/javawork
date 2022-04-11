package kaoShi.no5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();//创建集合
		students.add(new Student("李四",1,88));//添加元素
		students.add(new Student("刘四",2,78));
		students.add(new Student("张三",3,98));
		students.add(new Student("王维",4,96));
		//2:排序
		Collections.sort(students);
		//3:输出打印
		for(Student s:students){
			System.out.println(s);
		}
	}
}
