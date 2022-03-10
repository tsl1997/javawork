import java.util.Scanner;

public class ExtendExercise1 {
	public static void main(String[] args) {
		//1:获取用户输入的账号和密码
		Scanner input = new Scanner(System.in);
		System.out.print("请输入账号：");
		String uesrName = input.next();
		System.out.print("请输入密码：");
		int password = input.nextInt();
		//2:判断、如果用户名等于字符’青’，且密码等于数字123，则输出“欢迎你，青”；
		// 否则输出“对不起，你不是青”。
		if (uesrName.equals("青")&&password==123){
			System.out.println("欢迎你，青！");
		}else {
			System.out.println("对不起，你不是青");
		}
	}
}
