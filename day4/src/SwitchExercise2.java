import java.util.Scanner;

public class SwitchExercise2 {
	public static void main(String[] args) {
		//1:获取用户输入的数字
		Scanner input = new Scanner(System.in);
		System.out.print("请输入星期几：");
		int week = input.nextInt();
		//2:输出具体的星期信息
		switch (week){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期日");
				break;
			default:
				System.out.println("信息输入错误，请检查！");
				break;
		}
	}
}
