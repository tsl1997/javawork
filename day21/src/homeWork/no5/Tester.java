package homeWork.no5;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		//1：数据
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个字符串：");
		String s=sc.nextLine();//获取目标字符串
		System.out.print("请输入要查找的字符：");
		String s1 = sc.nextLine();//查找字符串
		//2：逻辑
		String[] split = s.split(s1);//分割字符串
		//3：输出结果
		System.out.println("\""+s+"\"中包含"+(split.length-1)+"个\""+s1+"\"");
	}
}
