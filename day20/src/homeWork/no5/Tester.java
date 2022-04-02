package homeWork.no5;

import com.sun.xml.internal.bind.util.Which;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//监听器
		while (true) {
			//数据
			System.out.print("请输入用户名：");
			String userName = sc.nextLine();
			System.out.print("请输入密码：");
			String password = sc.nextLine();
			System.out.print("请再次输入密码：");
			String toPassword = sc.nextLine();
			//逻辑
			if (userName.length()<3){
				System.out.println("用户名长度不小于3位");
			}else if (password.length()<6){
				System.out.println("密码不小于6位");
			}else if(!password.equals(toPassword)){
				System.out.println("两次输入的密码不同");
			}else{
				System.out.println("注册成功!请牢记用户名和密码。");
				break;
			}
		}
	}
}
