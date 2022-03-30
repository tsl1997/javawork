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

	@Test //测试PersonService
	public void Test3(){
		Teacher teacher = new Teacher("老王",35);//创建老师对象
		Student student = new Student("小李",15);//创建学生对象
		PersonService p = new PersonService();//创建人类服务对象
		p.method(teacher);//调用方法,传入教师对象参数
		p.method(student);//调用方法,传入学生对象参数

	}
}
