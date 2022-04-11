package kaoShi.no6;

import java.util.*;

public class Tester {
	public static void main(String[] args) {
		//创建结婚
		ArrayList<String> list = new ArrayList<>();
		//添加数据
		Collections.addAll(list,"铅笔","本子","橡皮擦","铅笔","铅笔","本子","本子","本子");
		Iterator<String> it = list.iterator();//迭代器
		HashMap<String, Integer> map = new HashMap<>();//定义map集合
		while(it.hasNext()){
			String n = it.next();
			map.merge(n, 1, Integer::sum);//当集合不存在时，添加元素，存在时，覆盖，次数+1
		}
		//打印输出 增强for
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		System.out.println("商品名称\t\t数量");
		for(Map.Entry<String, Integer> e:entries){
			System.out.println(e.getKey() + "\t\t" + e.getValue());
		}

	}
}
