import java.util.Scanner;

public class ExtendExercise4 {
	public static void main(String[] args) {
		//1：获取用户输入的java成绩
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的java成绩：");
		int num = input.nextInt();
		//2:如果考试成绩==100分，父亲给她买辆车
		//如果考试成绩>=90分，母亲给她买一部笔记本电脑
		//如果考试成绩>=60分,母亲给她买一部手机
		//如果考试成绩<60分，没有礼物。
		if (num==100){
			System.out.println("父亲给她买辆车");
		}else if (num>=90){
			System.out.println("母亲给她买一部笔记本电脑");
		}else if (num>=60){
			System.out.println("母亲给她买一部手机");
		}else{
			System.out.println("好好学习，没有礼物");
		}
	}
}
