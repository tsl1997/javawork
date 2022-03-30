package KaoShi.no1;

import org.junit.Test;

public class Tester {
	@Test //Student对象测试
	public void Test1(){
		Student student = new Student("张三",18);//创建对象
		student.show();//调用方法
	}

	@Test //Undergraduate对象测试
	public void Test2(){
		Undergraduate undergraduate = new Undergraduate("李四",25,"硕士");//建对象
		undergraduate.show();//调用方法
	}


}
