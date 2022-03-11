import java.util.Scanner;

public class Homework5 {
	public static void main(String[] args) {
		//5、从键盘上输入一位整数，当输入1-7时，显示下面对应的英文星期名的缩写
		//1：MON    2：TUE    3:WED    4:THU     5:FRI     6:SAT     7:SUN
		Scanner input = new Scanner(System.in);
		System.out.print("请输入今天是星期几(1-7)？：");
		int week = input.nextInt();
		switch (week){
			case 1:
				System.out.println("MON");
				break;
			case 2:
				System.out.println("TUE");
				break;
			case 3:
				System.out.println("WED");
				break;
			case 4:
				System.out.println("THU");
				break;
			case 5:
				System.out.println("FRI");
				break;
			case 6:
				System.out.println("SAT");
				break;
			case 7:
				System.out.println("SUN");
				break;
			default:
				System.out.println("请输入合法数字！");
				break;
		}
	}
}
