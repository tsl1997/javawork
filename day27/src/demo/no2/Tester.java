package demo.no2;

import java.util.Scanner;

public class Tester {
	/*控制台提示用户输入一个字符串，判断字符串左右两边是否对称*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一段字符串：");
		String s = sc.next();//
		StringBuilder str = new StringBuilder(s);
		str.reverse();
		if(s.equals(str.toString())){
			System.out.println("该字符串左右对称！");
		}else{
			System.out.println("该字符串左右不对称！");
		}


	}
}
