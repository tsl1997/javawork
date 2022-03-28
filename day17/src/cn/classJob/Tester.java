package cn.classJob;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入圆的半径：");
		double r = input.nextDouble();
		double area = round.getArea(r);//传入半径
		System.out.println("圆的面积为："+area);//输出面积
	}
}
