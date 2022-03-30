package KaoShi.no5;

import org.junit.Test;

public class Tester {
	@Test //测试老师对象
	public  void Test1(){
		Teacher teacher = new Teacher("老王",35);//创建对象
		teacher.teach();//调用方法
		teacher.eat();//调用方法
	}

	@Test //测试学生对象
	public void Test2(){
		Student student = new Student("小李",15);//创建对象
		student.learn();//调用方法
		student.eat();//调用方法
	}
}
