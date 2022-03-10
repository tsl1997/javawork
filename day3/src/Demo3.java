import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("请输入4位会员卡号：");
		int num1 = num.nextInt();//获取会员卡号保存
		System.out.print("会员卡号是："+num1);
	}
}
