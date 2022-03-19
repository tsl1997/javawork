import java.util.Scanner;

/**
 * 这是学生测试类*/
public class TestStudent {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		for (int i=0;i<5;i++) {//多次输入
			System.out.print("请输入学生姓名：");
			String name = input.next();//获取学生姓名
			new Student().addName(name);//调用方法
		}

		System.out.print("请输入开始查找的位置：");
		int number = input.nextInt();
		System.out.print("请输入结束查找的位置：");
		int lastNumber = input.nextInt();
		System.out.println("请输入查找的姓名：");
		String name = input.next();
		String[] a={"张三","李四","王五","赵六","玄七"};//
		new Student().findName(number,lastNumber,name,a);//调用方法

	}
}
