import java.util.Scanner;

public class KaoShi4 {
	public static void main(String[] args) {
		/*使用Scanner提示用户输入5个数字，找出5个数字中的最大值和最小值，并输出*/
		Scanner input = new Scanner(System.in);
		int num ;//定义数值，
		int max = 0;//定义最大值
		int min = 0;//定义最小值
		//1:for循环获取用户输入的5个数值
		for (int i=1;i<=5;i++){
			System.out.print("请输入第"+i+"个数字：");
			num = input.nextInt();//获取用户输入的数值
			//2：判断Num的值到底赋给谁
			if (i==1){//获取第一个数值
				max=num;//初始化最大值
				min=num;//初始化最小值
			}
			if (num>=max){
				max=num;//将最大值永远给到max
				continue;
			}
			if (num<=min){
				min=num;//将最小值永远给到min
			}
		}
		System.out.println("最大值是："+max);
		System.out.println("最小值是："+min);
	}
}
