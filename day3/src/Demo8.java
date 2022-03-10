import java.util.Scanner;

public class Demo8 {
	public static void main(String[] args) {
		Scanner money = new Scanner(System.in);
		System.out.println("请输入本金：");
		int principal = money.nextInt();//获取用户输入本金
		double money1 = principal*(1+0.0225);//一年本息
		double money2 = principal*(1+0.027*2);//两年本息
		double money3 = principal*(1+0.0324*3);//三年本息
		double money5 = principal*(1+0.036*5);//五年本息
		System.out.println("本金为："+(double)principal);//输出本金，带浮点
		System.out.println("一年后的本息是："+money1);//输出本息
		System.out.println("两年后的本息是："+money2);
		System.out.println("三年后的本息是："+money3);
		System.out.println("五年后的本息是："+money5);
	}
}
