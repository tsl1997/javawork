package kaoShi.no3;

import java.util.Random;

public class Tester {
	public static void main(String[] args) {
		Random r = new Random();//创建随机数对象
		int blue = r.nextInt(16) + 1;//保存蓝色的球
		int[] red =new int[6];//创建红球数组
		for(int i=0;i<red.length;i++){
			boolean is;//流程控制
			int temp;//临时红球
			do {
				is=false;//每轮开始重置
				temp = r.nextInt(33) + 1;//生成红球
				for (int j = 0; j < i; j++) {
					if (temp == red[j]) {
						is=true;//如果相同，重复执行
					}
				}
			}while(is);
			red[i] =temp;//取出不重复的红球
		}
		System.out.println("蓝球：\t\t\t红球：");
		System.out.print(blue+"\t\t\t");
		for (int i:red){
			System.out.print("\t"+i);
		}



	}
}
