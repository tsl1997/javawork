/**
 * 类和对象，作业第三题，调用Student类*/
public class TestStudent{
	public static void main(String[] args) {
		Student myStudent = new Student();//创建对象
		myStudent.name="方涵";
		myStudent.age=16;
		myStudent.myClass=2502;
		myStudent.love="写代码";

		//调用方法
		myStudent.showInfo();
	}
}
