import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("合格了吗？(y/n)：");
		String is = input.next();
		while (!is.equalsIgnoreCase("y")){
			System.out.println("上午读教材！");
			System.out.println("下午学编程！");
			System.out.print("合格了吗？(y/n)：");
			is = input.next();
		}
		System.out.println("完成学习任务！");
	}
}
