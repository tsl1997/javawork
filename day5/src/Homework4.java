import java.util.Scanner;

public class Homework4 {
	public static void main(String[] args) {
		//从键盘上接收一批整数，比较并输出其中的最大值和最小值。输入数字0时结束循环，
		//1：定义变量
		int num = -1;//定义获取变量num，初始化为-1，因为0结束循环
		int numMax = 0;//定义最大值变量，初始化为0
		int numMin = 0;//定义最大值变量，初始化为0
		Scanner input = new Scanner(System.in);//定义scanner类，获取用户数输入数据
		//2:开始编写循环内容
		while (true){
			System.out.print("请输入一个整数（输入0结束）：");
			num = input.nextInt();//将用户输入数据赋值给变量num

			if (num==0){
				break;//如果num是0的话跳出循环
			}

			if (num>numMax){
				numMax=num;//如果num比max大，那么将num赋值给max
			}else if(numMin>num){
				numMin=num;//如果num比min小，那么将num赋值给min
			}
		}
		System.out.println("最大值是："+numMax+"\t\t最小值是："+numMin);//输出结果
	}
}
