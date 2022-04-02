package homeWork.no6;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//数据
		System.out.println("---欢迎进入作业提交系统---");
		System.out.print("请输入java文件名：");
		String javaDoc = sc.nextLine();
		System.out.print("请输入你的邮箱");
		String email = sc.nextLine();
		//逻辑
		if (!javaDoc.toLowerCase().endsWith(".java")){
			System.out.println("java文件名错误！");
		}else if (!email.contains("@") || !email.contains(".")){
			System.out.println("email格式错误！");
		}else if(!email.substring(email.indexOf("@")+1).contains(".")){
			System.out.println("email格式错误！");
		}else{
			System.out.println("作业提交成功！");
			return;
		}
		System.out.println("作业提交失败！");


	}
}
