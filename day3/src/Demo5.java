import java.util.Scanner;

public class Demo5 {
	public static void main(String[] args) {
		Scanner name = new Scanner(System.in);
		System.out.print("请输入你的姓名：");
		String nameLast = name.next();
		System.out.print("请输入你的号码：");
		String nameMoney = name.next();
		System.out.println(nameLast+"您好！您的等待号码为："+nameMoney);
	}
}
