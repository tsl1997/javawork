import java.util.Scanner;

public class KaoShi2 {
	public static void main(String[] args) {
		/*需求：Scanner提示用户输入两个整数，通过循环找出这两个数字的公约数
		公约数的概念：能被两个数字同时整除的数
		举例：7 49的公约数：1和7
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入第一个整数：");
		int num1 = input.nextInt();
		System.out.print("请输入第二个整数：");
		int num2 = input.nextInt();
		//2：分析，如何循环，循环的最大值为num1和num2
		for (int i=1;i<=num1;i++){//取num1和num2均可
			if (num1%i==0 && num2%i==0){//当1能同时被正常，说明i是公约数
				System.out.println(i);//输出公约数
			}
		}
	}
}
