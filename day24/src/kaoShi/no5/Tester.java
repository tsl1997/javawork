package kaoShi.no5;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();//创建集合
		students.add(new Student("李四",1,88));//添加元素
		students.add(new Student("刘四",2,78));
		students.add(new Student("张三",3,98));
		students.add(new Student("王维",4,96));
		//2:排序
		int size = students.size();//取元素个数，方便计算
		for(int i=0;i<size;i++){
			for(int j=i;j<size;j++) {
				Student si = students.get(i);//取出对象，方便使用
				Student sj = students.get(j);
				if(si.getScore()> sj.getScore()){
					students.set(i,sj);//交换对象
					students.set(j,si);
				}
			}
		}
		//3:输出打印
		for(Student s:students){
			System.out.println(s);
		}
	}
}
