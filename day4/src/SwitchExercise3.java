import java.util.Scanner;

public class SwitchExercise3 {
	public static void main(String[] args) {
		//1:打印一个商品列表
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println("************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1:T恤\t\t2.网球鞋\t\t3.网球拍");
		System.out.println("************************");
		//2:获取用户的选择商品
		Scanner input = new Scanner(System.in);
		System.out.print("请输入商品编号：");
		int num = input.nextInt();
		//3：Switch选择对应的商品和价格并且输出
		switch (num){
			case 1:
				System.out.println("T恤\t\t\t￥245.0");
				break;
			case 2:
				System.out.println("网球鞋\t\t\t￥233.0");
				break;
			case 3:
				System.out.println("网球拍\t\t\t￥360.0");
				break;
			default:
				System.out.println("编号输入错误，请检查！");
				break;
		}
	}
}
