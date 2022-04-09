package homeWork.no7;

import java.util.HashMap;

public class StudentTest {
	public static void main(String[] args) {
		//1:数据
		HashMap<String, Student> map = new HashMap<>();
		map.put("Jack",new Student("杰克"));
		map.put("Rose",new Student("玫瑰"));
		//2:逻辑
		System.out.println("键集"+map.keySet());
		System.out.println("值集"+map.values());
		System.out.println("键值集"+map.entrySet());
		boolean bool = map.containsKey("Rose");
		if (bool) {
			System.out.println("Rose的姓名是："+map.get("Rose").getName());
		}

	}
}
