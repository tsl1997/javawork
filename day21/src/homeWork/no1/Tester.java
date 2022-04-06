package homeWork.no1;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//监听器
		System.out.print("请输入一串字符串：");
		StringBuilder sb = new StringBuilder(sc.nextLine());//获取字符串
		for(int i=sb.length()-3; i>=0; i-=3){
			sb.insert(i, ",");//添加逗号
		}
		System.out.println(sb);//打印结果
	}

}
