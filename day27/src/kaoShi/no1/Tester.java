package kaoShi.no1;

import java.util.Scanner;

public class Tester {
	public static int function(int x){
		if(x==0){
			return x;
		}
		if(x>0){
			return x+3;
		}
		return x*x-1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个整数X：");
		int x = sc.nextInt();
		System.out.println(x+"的函数计算结果y为："+Tester.function(x));
	}
}
