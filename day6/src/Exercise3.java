import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		/*day06课后必做作业，第三题：
		 *使用for循环循环输出对应数字的加法表，效果如图所示。这里的for循环中使用两个循环变量，
		 *一个从0开始自增（++）循环，一个从键盘录入的值自减（--）循环。
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个值：");
		int num = input.nextInt();//获取目标值
		//2:逻辑，定义一个自增的量，用和为定值来确定自减的量
		for (int i=0;i<=num;i++){//自增
			int j = num-i;//定义另外一个变量
			System.out.println(i+" + "+j+" = "+(i+j));//输出内容
		}
	}
}
