package classJob;

import org.junit.Test;

import java.util.*;

public class Tester {
	@Test
	public void testJiSuanQi(){
		JiSuanQi j = new JiSuanQi();
		//int[ ] nums= {1,5,9};
		int add = j.add(1, 2, 3, 6);
		System.out.println(add);
	}
	@Test
	public void Test(){
		//1:数据
		ArrayList<Student> class1 = new ArrayList<>();
		Collections.addAll(class1,new Student("瑶瑶",18),new Student("云樱",26));
		ArrayList<Student> class2 = new ArrayList<>();
		Collections.addAll(class2,new Student("李白",28),new Student("韩信",24));
		HashMap<String, ArrayList<Student>> map = new HashMap<>();
		map.put("王者",class1);
		map.put("历史",class2);
		//2：逻辑
		Set<Map.Entry<String, ArrayList<Student>>> entries = map.entrySet();
		for(Map.Entry<String, ArrayList<Student>> en:entries){
			System.out.println("班级名称："+en.getKey());
			ArrayList<Student> v = en.getValue();//取出班级信息
			double sum=0;
			for(Student s:v){
				int score = s.getScore();
				sum+=score;
				System.out.println(s.getName()+"\t"+score);
			}
			System.out.println("总分："+sum+" 平均分："+(sum/v.size()));
		}
	}
}
