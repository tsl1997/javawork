package homeWork.no7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Tester6 {
	public static void main(String[] args) {
		//1:数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入域一段单词字符串：");
		String s = sc.nextLine();
		//2:逻辑
		String[] s1 = s.split(" ");//空格分割
		HashMap<String, Integer> map = new HashMap<>();
		for(String str:s1){
			boolean b = map.containsKey(str);
			if(!b){
				map.put(str,1);//没有添加，次数为1
			}else{
				map.put(str,map.get(str)+1);//有的话，覆盖添加，次数加1
			}
		}
		//3:输出打印
		System.out.println("各个单词出现的频率如下：");
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> en:entries){
			System.out.println(en.getKey()+"="+en.getValue());
		}


	}
}
