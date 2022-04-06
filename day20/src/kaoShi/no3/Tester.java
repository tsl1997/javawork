package kaoShi.no3;

import java.util.Random;

public class Tester {
	public static void main(String[] args) {
		Random r = new Random();//创建随机数对象
		int blue = r.nextInt(16) + 1;//保存蓝色的球
		int[] red =new int[6];//创建红球数组
		for(int i=0;i<red.length;i++){
			int temp = r.nextInt(33) + 1;//临时红球
			red[i] =temp;
		}
		System.out.println("蓝球：\t\t\t红球：");
		System.out.print(blue+"\t\t\t");
		for (int i:red){
			System.out.print("\t"+i);
		}



	}
}
