import java.util.Scanner;

public class Honework6 {
	public static void main(String[] args) {
		//题目：假设用户名和密码均为admin，如果输入正确，控制台输出：欢迎admin登录
		//如果输入错误，控制台输出：录入错误,您还有2次机会（最多有3次机会）
		//1：定义变量和数据
		Scanner input = new Scanner(System.in);//设置监听器
		String user = "admin";//定义正确的账号和密码
		String name = "";//定义用户输入的账号
		String password = "";//定义用户输入的密码
		int count = 3;
		while ((!user.equals(name) || !user.equals(password) )&& count>0){
			System.out.print("请输入账号：");
			user = input.next();//获取用户输入账号
			System.out.print("请输入密码：");
			password = input.next();//获取用户输入密码
			count-=1;
			if (user.equals(name) && user.equals(password)){
				System.out.println("欢迎admin登录");//登录成功，结束程序
				return;
			}
			System.out.println("录入错误,您还有"+count+"次机会（最多有3次机会）");
		}
	}
}
