import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		/*首先获取键盘录入的学生姓名，然后正确使用while循环，
		循环获取某同学的S1结业考试的5门课成绩，最后计算平均分并输出，效果如图所示。
		Yes:表示继续输入，其他按键表示退出循环（如果总分大于>700）自动退出循环*/
		Scanner input = new Scanner(System.in);
		//1：获取学生姓名
		System.out.print("请输入学生姓名：");
		String name = input.next();
		//2:定义变量
		String is = "";
		System.out.println("是否继续输入(y/n)：");
		is = input.next();



	}
}
