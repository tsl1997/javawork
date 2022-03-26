package cn.k2502.homeWork8;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GoodsService goods = new GoodsService();//创建对象
		System.out.print("输入1选择电视类，输入2选择食品类：");
		int num = scanner.nextInt();
		System.out.println(goods.findGoods(num));//调用并打印
	}
}
