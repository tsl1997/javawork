package kaoShi.no2;

import java.util.*;

public class Tester {
	public static void main(String[] args) {
		/*2、分别使用List集合、Set集合保存10个随机数。并在控制台输出。*/
		List<Integer> list = new ArrayList<>();//list集合
		Set<Integer> set = new HashSet<>();//set集合
		Random random = new Random();//random随机数
		//添加随机数
		for(int i=0;i<10;i++){
			int num = random.nextInt(100);
			list.add(num);
			set.add(num);
		}
		//打印输出
		System.out.println("list集合：");
		for(Integer l:list){
			System.out.println(l);
		}
		System.out.println("set集合：");
		for(Integer s:set){
			System.out.println(s);
		}
	}
}
