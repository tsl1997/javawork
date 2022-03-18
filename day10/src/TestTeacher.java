/**
 *  * 类和对象，作业第三题，调用Teacher类*/
public class TestTeacher {
	public static void main(String[] args) {
		Teacher myTeacher= new Teacher();//创建对象
		myTeacher.name="王德华";//赋值
		myTeacher.specialty="计算机";
		myTeacher.course="使用java语言从入门到入土";
		myTeacher.age=5;

		//调用方法
		myTeacher.showInfo();
	}
}
