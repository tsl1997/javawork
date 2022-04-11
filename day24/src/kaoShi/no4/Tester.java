package kaoShi.no4;

import java.util.HashMap;

public class Tester {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();//定义map集合
		map.put(1,"张三丰");//添加数据
		map.put(2,"周芷若");
		map.put(3,"汪峰");
		map.put(4,"灭绝师太");
		//1:将map集合打印到输出台上
		System.out.println(map);
		//2:向map中插入5，李晓红的元素
		map.put(5,"李晓红");
		//3：删除map集合中编号为1的元素
		map.remove(1);
		//4:将元素2的v改成周林
		map.put(2,"周林");
		//5：输出map信息
		System.out.println(map);
	}
}
