import java.util.Scanner;
/*正确使用数组和循环存储5笔购物金额，在控制台循环输出每笔金额并计算总金额*/
public class HomeWork3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] shoppings=new double[5];//定义购物数组
		double sum=0;//定义求和变量
		System.out.println("请输入会员本月的消费记录");
		//1:循环输入5个购物数据
		for (int i=0;i<5;i++){
			System.out.print("请输入第"+(i+1)+"笔购物金额：");
			shoppings[i] = input.nextDouble();//获取数据
			sum+=shoppings[i];//求和
		}
		//2:输出每一笔金额
		System.out.println();//换行，控制界面
		System.out.println("序号\t\t\t\t金额(元)");
		for (int i=0;i<5;i++){
			System.out.println((i+1)+"\t\t\t\t"+shoppings[i]);//遍历数组
		}
		System.out.println("总金额\t\t\t"+sum);//输出总金额
	}
}
