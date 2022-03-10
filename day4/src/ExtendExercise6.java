import java.util.Scanner;

public class ExtendExercise6 {
	public static void main(String[] args) {
		//1；获取用户输入月份
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您出行的月份：");
		int month = input.nextInt();
		//2：获取用户的舱位
		System.out.println("请问您选择头等舱还是经济舱？头等舱输入1，经济舱输入2");
		int is = input.nextInt();
		//3:计算机票价格
		if (is==1){
			switch (month){
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					System.out.println("您的机票价格是："+5000*0.9);
					break;
				case 11:
				case 12:
				case 1:
				case 2:
				case 3:
					System.out.println("您的机票价格是："+5000*0.5);
					break;
				default:
					System.out.println("月份输入错误，请检查！");
					break;
			}
		}else if (is==2){
			switch (month){
				case 4:
				case 5:
				case 6:
				case 7:
				case 8:
				case 9:
				case 10:
					System.out.println("您的机票价格是："+5000*0.8);
					break;
				case 11:
				case 12:
				case 1:
				case 2:
				case 3:
					System.out.println("您的机票价格是："+5000*0.4);
					break;
				default:
					System.out.println("月份输入错误，请检查！");
					break;
			}
		}else{
			System.out.println("舱位输入不合法，请输入1或者2！");
		}
	}
}
