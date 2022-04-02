package cn.k2052;

import java.util.Scanner;

public class ClassNum2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的邮箱：");
		String email = sc.next();
		if (!email.contains("@") || !email.contains(".")){
			System.out.println("输入错误，请重新输入");

			return;
		}
		if (email==null || email.isEmpty()){
			System.out.println("请输入字符！");
			return;
		}
		String s=email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
		System.out.println(s);
	}
}
