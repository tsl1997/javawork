import java.util.Scanner;

public class Exercise4 {
	public static void main(String[] args) {
		/*day06课后必做作业，第四题：
		*从键盘上接收从周一至周五每天的学习时间（以小时为单位），并计算每日平均学习时间。
		* */
		Scanner input = new Scanner(System.in);
		int time = 0;//定义时间变量
		double sun = 0;//定义求和变量
		//2:逻辑：5门功课循环
		for (int i=1;i<=5;i++){
			System.out.print("请输入周"+i+"的学习时间：");
			time = input.nextInt();
			sun+=time;//求和
		}
		System.out.println("周一至周五每日平均学习时间是："+sun/5);
	}
}
