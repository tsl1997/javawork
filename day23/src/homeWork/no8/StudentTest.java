package homeWork.no8;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentTest {
	public static void main(String[] args) {
		//1:数据
		HashMap<String, Student> class1 = new HashMap<>();//创建班级
		Student c1 = new Student("张三", "c1", 56.5);//创建学生
		Student c2 = new Student("王三", "c2", 76.5);
		Student c3 = new Student("赵六", "c3", 96.5);
		class1.put(c1.getNo(), c1);//添加学生进入班级
		class1.put(c2.getNo(), c2);
		class1.put(c3.getNo(), c3);
		HashMap<String, Student> class2 = new HashMap<>();
		Student s1 = new Student("韩信", "s1", 66.5);
		Student s2 = new Student("赵云", "s2", 77.5);
		class2.put(s1.getNo(),s1);
		class2.put(s2.getNo(),s2);
		HashMap<String, HashMap<String, Student>> map = new HashMap<>();//创建学校
		map.put("c1",class1);//添加班级进入学校
		map.put("s1",class2);
		//2:逻辑
		Set<Map.Entry<String, HashMap<String, Student>>> entries = map.entrySet();
		for(Map.Entry<String, HashMap<String, Student>> e:entries){
			System.out.println(e.getKey()+"班级：");
			HashMap<String, Student> value = e.getValue();//获取班级的键值集
			Set<String> strings = value.keySet();//获取班级
			double sum=0;
			for(String s:strings){
				sum += value.get(s).getScore();
			}
			System.out.println("总分为："+sum);
			System.out.println("平均分为："+sum/value.size());
		}
	}
}
