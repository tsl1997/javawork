import java.util.Scanner;
/*
* （1）定义数组存储价格，并利用循环输入；
（2）定义变量min保存当前的最低价；
（3）将min和数组中的其余元素依次比较；*/
public class HomeWork5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double[] prices=new double[4];//我认为在实际生活中价格是带小数点的
		System.out.println("请输入4家店的价格");
		//1:获取用户输入的价格数据
		for (int i=0;i<4;i++){
			System.out.print("第"+(i+1)+"家店价格：");
			prices[i] = input.nextDouble();
		}
		//2:求最小值
		double min=prices[0];//假设第一个就是最小值
		for (int i=1;i<4;i++){
			if (min>prices[i]){
				min=prices[i];//永远将最小值给min
			}
		}
		//3：输出结果
		System.out.println("最低价格："+min);
	}
}
