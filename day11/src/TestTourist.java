import java.util.Scanner;
/**
 * 调用/测试游客类*/
public class TestTourist {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入姓名：");
		String name = input.next();//获取用户输入的姓名
		System.out.println("请输入年龄：");
		int age = input.nextInt();//获取用户输入的年龄
		int price=new Tourist().ticket(age);//调用方法，传递结果
		System.out.println(name+"的门票年龄是："+age+"，门票价格是："+price+"元");//输出结果
	}
}
