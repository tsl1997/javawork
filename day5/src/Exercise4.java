import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		//1:打印菜单
		Scanner input = new Scanner(System.in);
		System.out.println("MyShopping管理系统>购物结算");
		System.out.println("***************************");
		System.out.println("请选择购买的商品编号：");
		System.out.println("1.T恤\t"+"2.网球鞋\t"+"3.网球拍\t");
		System.out.println("***************************");
		//2：开始进入系统
		String is = "";//设置循环变量
		while (!is.equals("y")){
			System.out.print("请输入商品编号：");
			int num = input.nextInt();//获取商品编号
			switch (num){
				case 1:
					System.out.println("1:T恤\t￥245.0");
					break;
				case 2:
					System.out.println("2.网球鞋\t￥388.0");
					break;
				case 3:
					System.out.println("3.网球拍\t￥866.0");
					break;
				default:
					System.out.println("你输入的商品编号不存在，请重新输入！");
					break;
			}
			System.out.print("是否继续？(y/n):");
			is = input.next();//改变条件变量
		}
	}
}
