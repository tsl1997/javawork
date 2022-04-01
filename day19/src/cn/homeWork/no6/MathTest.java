package cn.homeWork.no6;

import java.util.Scanner;

public class MathTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//监听器
		System.out.println("我行我素购物管理系统->幸运抽奖");
		System.out.println("请输入4位会员号:");
		int vipID=0;
		try {
			vipID = sc.nextInt();//获取会员号
		} catch (Exception e) {
			e.printStackTrace();//打印异常
		}
		int baiWei=vipID/100%10;//获取百位数据
		int randomNumber=(int)(Math.random()*10);//获取一个整数
		if (baiWei==randomNumber){
			System.out.println(vipID+"是幸运客户，获得精美MP3一个。");
		}else{
			System.out.println("很遗憾。你没有中奖。");
		}

	}
}
