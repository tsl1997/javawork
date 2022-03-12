import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		//菱形
		//1:9行，上下对称，故-4到+4
		Scanner input = new Scanner(System.in);
		int num;
		do {
			System.out.print("请输入需要打印的菱形行数(奇数）：");
			num = input.nextInt();
			if (num%2!=0){
				break;//当输入数据合法时跳出循环
			}
			System.out.println("输入数据不合法！");
		}while (true);

		for (int i=-num/2;i<=num/2;i++){
			//2:打印空格
			for (int j=1;j<=Math.abs(i);j++){
				System.out.print("\t");
			}
			//3:打印星星
			for (int k=1;k<=num-Math.abs(i)*2;k++){
				System.out.print("*\t");
			}
			System.out.println();//换行
		}
	}
}
