package homeWork.no5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Class aClass = new Class();
		System.out.print("请输入课程代号(1-3之间的数字)：");
		try {
			int num=input.nextInt();
			aClass.toClass(num);
		} catch (InputMismatchException e) {
			System.err.println("数据不匹配异常");
			e.printStackTrace();
		}catch (RuntimeException e) {
			e.printStackTrace();
		} finally {
			System.out.println("欢迎提出建议！ ");
		}

	}
}
