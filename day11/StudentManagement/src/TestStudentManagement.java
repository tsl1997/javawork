import java.util.Scanner;

/**这是一个测试类*/
public class TestStudentManagement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StudentManagement students = new StudentManagement();
		for (int i=0;i<5;i++){
			System.out.print("请输入学生姓名：");
			String name = input.next();//获取姓名
			students.add(name);//调用方法添加姓名
		}
		System.out.println("学生信息如下：");
		System.out.println(students.showInfo());//将结果传递出来并打印
		System.out.print("请输入开始的位置");
		int start = input.nextInt();
		System.out.print("请输入结束的位置：");
		int end = input.nextInt();
		System.out.print("请输入查找的学生姓名：");
		String name = input.next();
		boolean isOk=students.find(start,end,name);//寻找结果，获取值并且返回给isOk
		if (isOk){
			System.out.println("找到了");
		}else {
			System.out.println("找不到");
		}

	}
}
