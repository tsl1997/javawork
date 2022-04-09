package homeWork.no7;

import java.util.*;

/**扩展第一题*/
public class Tester7 {
	public static void main(String[] args) {
		//1:数据
		Student s1 = new Student("秦罗敷", 12);
		Student s2 = new Student("叶罗丽", 18);
		Student s3 = new Student("水仙花", 16);
		HashMap<Student, String> map = new HashMap<>();
		map.put(s1,"南方大道1号");
		map.put(s2,"南方大道2号");
		map.put(s3,"南方大道3号");
		//输出key v 具体实现方法子啊下面的静态方法中
		System.out.println("------------第一种set集增强for输出----------------");
		print1(map);//第一种set集增强for输出
		System.out.println("------------第二种set集迭代器输出-----------------");
		print2(map);//第二种set集迭代器输出
		System.out.println("------------第三种键值集 增强for输出---------------");
		print3(map);//第三种键值集 增强for输出
		System.out.println("------------第四种键值集 迭代器输出----------------");
		print4(map);//第四种键值集 迭代器输出
	}

	public static void print1(HashMap<Student,String> map){
		Set<Student> set = map.keySet();//获取键集
		for(Student s:set){
			System.out.println(s+"::"+map.get(s));
		}
	}
	public static void print2(HashMap<Student,String> map){
		Set<Student> set = map.keySet();//获取键集
		Iterator<Student> it = set.iterator();
		while(it.hasNext()){
			Student n = it.next();
			System.out.println(n+"::"+map.get(n));
		}
	}

	public static void print3(HashMap<Student,String> map){
		Set<Map.Entry<Student, String>> entries = map.entrySet();
		for(Map.Entry<Student, String> e:entries){
			System.out.println(e.getKey()+"::"+e.getValue());
		}
	}

	public static void print4(HashMap<Student,String> map){
		Set<Map.Entry<Student, String>> entries = map.entrySet();
		Iterator<Map.Entry<Student, String>> it = entries.iterator();
		while(it.hasNext()){
			Map.Entry<Student, String> e = it.next();
			System.out.println(e.getKey()+"::"+e.getValue());
		}
	}

}
