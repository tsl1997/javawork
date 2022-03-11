import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		/*首先获取键盘录入的学生姓名，然后正确使用while循环，
		循环获取某同学的S1结业考试的5门课成绩，最后计算平均分并输出，效果如图所示。
		Yes:表示继续输入，其他按键表示退出循环（如果总分大于>700）自动退出循环*/
		Scanner input = new Scanner(System.in);
		String is = "";//定义是否继续输入第二位同学
		double sun = 0;//定义成绩求和变量
		int chengJi = 0;//定义成绩变量

		while (sun<=700 && !is.equalsIgnoreCase("yes")){
		//1：获取学生姓名
		System.out.print("请输入学生姓名：");
		String name = input.next();
		int i = 1;//定义功课变量,为什么放在循环内，因为输入第二个人时，需要重置功课变量
		//2:定义变量,已经放入循环外面了
		while (i<=5){
		System.out.print("请输入5门功课第"+i+"门成绩：");
		chengJi = input.nextInt();
		sun += chengJi;//将成绩求和给sun
		i++;//条件变量自增
		}
		System.out.println(name+"平均成绩为："+sun/5);//输出平均成绩
		//3：询问是否继续程序
		System.out.println("是否继续输入(y/n)：");//成绩sun大于700就自动结束了
		is = input.next();
		}
	}
}
