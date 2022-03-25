package cn.k2502.homeWork5;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GoodsService goods = new GoodsService();//创建对象
		System.out.print("输入1选择食品类，输入2选择测试类：");
		int num = scanner.nextInt();
		if (num==1){
			goods.findFoods().output();//输出食品类内容
		}else if (num==2){
			goods.findTvs().output();//输出电视类内容
		}else{
			System.out.println("输入有误！");
		}
	}
}
