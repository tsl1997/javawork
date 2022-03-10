import java.util.Scanner;

public class ExtendExercise2 {
	public static void main(String[] args) {
		//1:用户输入年龄
		Scanner input = new Scanner(System.in);
		System.out.print("请输入你的年龄：");
		int age = input.nextInt();
		//2:判断年龄是否大于7岁
		if (age>7){
			System.out.println("可以搬桌子");
		}else if (age>5){
			System.out.print("请输入性别：");
			String sex = input.next();//获取性别
			if (sex.equals("男")){
				System.out.println("可以搬桌子");
			}else {
				System.out.println("很抱歉，你不可以搬桌子哦！");
			}
		}else {
			System.out.println("很抱歉，你不可以搬桌子哦！");
		}
	}
}
