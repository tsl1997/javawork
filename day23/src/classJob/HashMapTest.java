package classJob;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		//1:数据
		Student s1 = new Student(4869,"江户川柯南",'男');
		Student s2 = new Student(5201,"灰原哀",'女');
		Student s3 = new Student(4392,"怪盗基德",'男');
		HashMap<Integer, Student> map = new HashMap<>();
		map.put(s1.getID(),s1);
		map.put(s2.getID(),s2);
		map.put(s3.getID(),s3);
		//2:逻辑
	/*	Collection<Student> values = map.values();
		System.out.println(values);
		for(Student student:values){
			System.out.println(student);
		}
		values.iterator();*/
		//键值集
		Set<Map.Entry<Integer, Student>> entries = map.entrySet();
		for(Map.Entry<Integer, Student> entry:entries){
			System.out.println(entry.getKey()+"---------->"+entry.getValue());
		}
		System.out.println("==============迭代器============");
		Iterator<Map.Entry<Integer, Student>> it = entries.iterator();
		while(it.hasNext()){
			Map.Entry<Integer, Student> n = it.next();
			System.out.println(n.getKey()+"====="+n.getValue().getName());
		}


	}
}
