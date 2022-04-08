package homeWork.no6;

import homeWork.no2.Dog;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		//1:数据
		HashMap<String, Dog> map = new HashMap<>();
		map.put("亚亚",new Dog("拉布拉多"));
		map.put("菲菲",new Dog("拉布拉多"));
		map.put("欧欧",new Dog("雪纳瑞"));
		map.put("美美",new Dog("雪纳瑞"));
		//2:逻辑、
		Set<Map.Entry<String, Dog>> e = map.entrySet();
		Iterator<Map.Entry<String, Dog>> it = e.iterator();
		System.out.println("所有狗狗的昵称和品种分别是：");
		while(it.hasNext()){
			Map.Entry<String, Dog> n = it.next();
			String key = n.getKey();
			String name = n.getValue().getName();
			System.out.println(key+"\t"+name);
		}

	}
}
