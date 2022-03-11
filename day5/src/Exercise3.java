import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String is = "";
		do{
			System.out.println("上午读教材！");
			System.out.println("下午学编程！");
			System.out.print("合格了吗？(y/n)：");
			is = input.next();
		}while (!is.equalsIgnoreCase("y"));//do while优化结构
		System.out.println("完成学习任务！");
	}
}
