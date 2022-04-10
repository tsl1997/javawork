package homeWork.no4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tester {
	public static void main(String[] args) {
		/*1、任意20个字母，输出出现次数最多的字母和次数
		要求：使用Map集合实现*/
		String demo="dsdgveafsdsafsafcasfsadfwefg";//随机字符串，也可以用scanner获取
		char[] chars = demo.toCharArray();//转换字符数组
		HashMap<Character, Integer> map = new HashMap<>();//定义map集合
		//System.out.println(map.get('d'));//测试获取情况
		for(Character c:chars){
			//找得到的话，就让元素的值增加1
			map.merge(c, 1, Integer::sum);//如果找不到就把这个元素存进去，初始化1
		}
		//2：输出结果
		System.out.println("各个元素出现的次数：");
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();//获取键值集
		for(Map.Entry<Character, Integer> e:entries){
			System.out.println(e.getKey()+"["+e.getValue()+"]");
		}
	}
}
