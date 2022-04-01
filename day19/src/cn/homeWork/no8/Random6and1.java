package cn.homeWork.no8;

import java.util.Random;

public class Random6and1 {
	public static void main(String[] args) {
		Random random = new Random();//创建随机数对象
		int blue = random.nextInt(16)+1;//获取蓝球
		int[] red=new int[6];//红球数组
		for (int i=0;i<red.length;i++){
			red[i]=random.nextInt(33)+1;//获取红球
		}

		//输出结果
		System.out.println("红球\t\t\t\t蓝球");
		for (int a:red){
			System.out.print(a+" ");
		}
		System.out.print(blue);
	}

}
