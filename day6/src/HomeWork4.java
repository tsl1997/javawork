import java.util.Scanner;

public class HomeWork4 {
	public static void main(String[] args) {
		//菱形
		//1:9行，上下对称，故-4到+4
		Scanner input = new Scanner(System.in);
		System.out.print("请输入需要打印的菱形行数(奇数）：");
		int num = input.nextInt();
		for (int i=1;i<=num/2;i++){
			//2:打印空格
			for (int j=1;j<=Math.abs(i);j++){
				System.out.print("\t");
			}
			//3:打印星星
			for (int k=1;k<=(5-Math.abs(i))*2-1;k++){
				System.out.print("*\t");
			}
			System.out.println();//换行
		}
	}
}
