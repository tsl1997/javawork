package homeWork.no3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		//1:数据
		HashMap<String, String> map = new HashMap<>();
		map.put("US","美利坚合众国");
		map.put("RU","俄罗斯联邦");
		map.put("CN","中华人民共和国");
		map.put("JP","小日本");
		//2:逻辑
		System.out.println("CN对应的国家是："+map.get("CN"));
		System.out.println("Map中共有"+map.size()+"组数据");
		System.out.println("Map中含有JP的key吗？"+map.containsKey("JP"));
		//3：打印输出
		System.out.println(map.keySet());//获取键集
		System.out.println(map.values());//获取值集
		System.out.println(map.entrySet());//获取键值对
		System.out.println(map);//打印hashmap集合
		map.clear();
		System.out.println("已清空Map中数据！");

		/*Set<Map.Entry<String, String>> e = map.entrySet();
		Iterator<Map.Entry<String, String>> it = e.iterator();
		StringBuilder key = new StringBuilder();
		StringBuilder value = new StringBuilder();
		while(it.hasNext()){
			Map.Entry<String, String> n = it.next();
			key.append(n.getKey()+",");
			value.append(n.getValue()+",");
		}
		//3:打印输出
		System.out.println("["+key+"]");
		System.out.println("["+value+"]");
		System.out.println(map);
		map.clear();
		System.out.println("已清空Map中数据！");
*/

	}
}
