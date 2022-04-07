package demo;

import org.junit.Test;

import java.util.*;

public class TesterHashSet {
	@Test //hashSet
	public  void testHashSet(){
		HashSet<String> hs = new HashSet<>();
		hs.add("小龙女");
		hs.add("黄蓉");
		hs.add("赵敏");
		hs.add("小龙女");//重复内容不添加
		System.out.println(hs);//hashset具有唯一性，依靠hashmap实现
	}
	@Test //hashMap
	public  void testHashMap(){
		HashMap<String, String> s = new HashMap<>();//创建哈希表
		s.put("Lolita","萝拉");
		s.put("源氏物语","紫花");
		s.put("南音","西决");
		s.put("红楼梦","林黛玉");
		s.put("哆啦A梦","野比大雄");
		String s1 = s.get("红楼梦");
		//System.out.println(s1);获取指定键的值
		Set<String> str = s.keySet();
		//迭代器遍历元素
		Iterator<String> it = str.iterator();
		while(it.hasNext()){
			String n = it.next();
			System.out.println(s.get(n));
		}
		//增强for遍历元素
		System.out.println("----------------");
		for(String a:str){
			System.out.println(s.get(a));
		}
		//遍历所有的键和值
		System.out.println("----------------");
		Set<Map.Entry<String,String>> set=s.entrySet();
		for(Map.Entry<String,String> me :set){
			String key=me.getKey();
			String value=me.getValue();
			System.out.println(key+" "+value);
		}
	}


}
