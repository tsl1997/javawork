package homeWork.no7;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args)throws Exception{
		Scanner input = new Scanner(System.in);
		Demo demo = new Demo();
		try {
			demo.setAge(input.nextInt());
			demo.setSex('猫');
		} catch (RuntimeException e) {
			System.err.println(e.getMessage());//只在控制台提示你传入的信息
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
