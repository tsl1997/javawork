package demo.no1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Tester {
	/*1、控制台提示用户输入一个字符串，过滤重复字符，并显示每个字符出现次数。效果如下：*/
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//监听器
		System.out.println("请输入一段字符：");
		String s = input.nextLine();
		HashMap<Character, Integer> map = new HashMap<>();//用来保存替换的map
		char[] chars = s.toCharArray();//转换为char数组
		for(char c:chars){
			if(map.get(c)==null){
				map.put(c,0);//没有就替换
			}else{
				map.put(c,map.get(c)+1);//有的话就加1
			}
		}
		//打印输出
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for(Map.Entry<Character, Integer> e:entries){
			System.out.println(e.getKey() + "--" + e.getValue());//打印输出结果
		}
	}
}
