package homeWork.no4;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//监听器
		System.out.print("请输入用户名：");
		String userName = sc.nextLine();
		System.out.print("请输入密码：");
		String password = sc.nextLine();
		String adminUser = "TOM";//设置标准密码
		String adminPass = "1234567";
		if (adminUser.equalsIgnoreCase(userName) && adminPass.equalsIgnoreCase(password)){
			System.out.println("登录成功！");
		}else{
			System.out.println("用户名或者输入错误！");
		}
	}
}
