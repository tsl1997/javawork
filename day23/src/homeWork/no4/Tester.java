package homeWork.no4;

import java.util.HashMap;

public class Tester {
	public static void main(String[] args) {
		//1:数据
		Student s1 = new Student("李芸", '女');
		HashMap<String, Student> map = new HashMap<>();
		map.put("aili",s1);
		//2:逻辑
		boolean aili = map.containsKey("aili");
		System.out.println("是否存在aili?"+aili);
		Student as = map.get("aili");
		//3:输出结果
		System.out.print("aili的学员姓名是："+as.getName());
		System.out.print(",性别是："+as.getSex());

	}

}
