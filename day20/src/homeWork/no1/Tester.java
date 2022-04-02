package homeWork.no1;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//监听器
		System.out.print("请输入用户名：");
		String userName = sc.nextLine();
		System.out.print("请输入密码：");
		String password = sc.nextLine();
		if (password.length()<6){
			System.out.println("密码长度小于6位！");
		}else{
			System.out.println("注册成功！");
		}
	}
}
