import java.util.Scanner;

public class Demo4 {
	public static void main(String[] args) {
		Scanner num = new Scanner(System.in);
		System.out.print("请输入4位会员卡号：");
		int numId = num.nextInt();//获取会员卡号保存
		System.out.println("会员卡号是："+numId);
		int num1 = numId/1000;//获取千位数据
		int num2 = (numId/100)%10;//获取百位数据
		int num3 = (numId/10)%10;//获取十位数据
		int num4 = numId%10;//获取个位数据
		System.out.print("千位数："+num1);
		System.out.print("\t百位数："+num2);
		System.out.print("\t十位数："+num3);
		System.out.println("\t个位数："+num4);
		int num5 = num1 + num2 + num3 + num4;//会员卡号之和
		System.out.println("会员卡号"+numId+"各位之和："+num5);
		String zhongJiang = num5>20?"您中奖了，奖品是MP3！":"很抱歉，您没有中奖哦！";
		System.out.println("会员卡号"+numId+"会员，"+zhongJiang);
	}
}