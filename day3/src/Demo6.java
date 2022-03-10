import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner goods = new Scanner(System.in);
		System.out.print("请输入第一件商品名称：");
		String name1 = goods.next();//获取用户输入商品名称
		System.out.print("请输入第一件商品尺寸：");
		double size1 = goods.nextDouble();//获取用户输入商品尺寸
		System.out.print("请输入第一件商品价格：");
		double price1 = goods.nextDouble();//获取用户输入商品价格
		System.out.print("请输入第一件商品库存：");
		int stock1 = goods.nextInt();//获取用户输入商品库存
		//第二件商品，复制上面内容
		System.out.print("请输入第二件商品名称：");
		String name2 = goods.next();//获取用户输入商品名称
		System.out.print("请输入第二件商品尺寸：");
		double size2 = goods.nextDouble();//获取用户输入商品尺寸
		System.out.print("请输入第二件商品价格：");
		double price2 = goods.nextDouble();//获取用户输入商品价格
		System.out.print("请输入第一件商品库存：");
		int stock2 = goods.nextInt();//获取用户输入商品库存
		//第三件商品，复制上面内容
		System.out.print("请输入第二件商品名称：");
		String name3 = goods.next();//获取用户输入商品名称
		System.out.print("请输入第二件商品尺寸：");
		double size3 = goods.nextDouble();//获取用户输入商品尺寸
		System.out.print("请输入第二件商品价格：");
		double price3 = goods.nextDouble();//获取用户输入商品价格
		System.out.print("请输入第一件商品库存：");
		int stock3 = goods.nextInt();//获取用户输入商品库存
		// 单纯分割线，为了美观
		int stock4 = stock1 + stock2 + stock3;//总库存数量
		double price4 = stock1*price1 + stock2*price2 + stock3*price3;//总商品价格
		System.out.println("----------商品库存清单----------");
		System.out.println("品牌型号\t\t尺寸\t\t价格\t\t存库数");//抱歉，真的对不齐了
		System.out.println(name1+"\t\t"+size1+"\t\t"+price1+"\t\t"+stock1);
		System.out.println(name2+"\t\t"+size2+"\t\t"+price2+"\t\t"+stock2);
		System.out.println(name3+"\t\t"+size3+"\t\t"+price3+"\t\t"+stock3);
		System.out.println("------------------------------");
		System.out.println("总库存数："+stock4);
		System.out.println("库存商品总金额："+price4);
	}
}