package homeWork.no7;

import java.util.*;

public class Tester5 {
	public static void main(String[] args) {
		//1:数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入域一段字符串：");
		String s = sc.nextLine();
		//2:逻辑
		char[] chars = s.toCharArray();//转换为char数组
		HashMap<Character, Integer> map = new HashMap<>();//定义map
		for (char c : chars){
			boolean b = map.containsKey(c);//判断有没有这个字符
			if(!b){
				map.put(c,1);//没有添加，次数为1
			}else{
				map.put(c,map.get(c)+1);//有的话，覆盖添加，次数加1
			}
		}
		//3：输出结果
		System.out.println("当前字符串的各个字符和出现的次数为：");
		Set<Map.Entry<Character, Integer>> entries = map.entrySet();
		for(Map.Entry<Character, Integer> e:entries){
			System.out.print(e.getKey()+"("+e.getValue()+")");
		}

	}
}
