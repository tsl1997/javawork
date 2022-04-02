package homeWork.no2;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//监听器
		System.out.print("请输入用户名：");
		String userName = sc.nextLine();
		System.out.print("请输入密码：");
		String password = sc.nextLine();
		if ("TOM".equalsIgnoreCase(userName)){
			System.out.println("登录成功！");
		}else{
			System.out.println("用户名输入错误！");
		}
	}
}
