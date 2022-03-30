package KaoShi.no2;

import org.junit.Test;

public class Tester {
	@Test //测试Squar对象
	public void Test1(){
		Square square = new Square();//创建对象
		double area = square.area(2);//调用方法
		System.out.println(area);//打印结果
	}
	@Test //测试Circle对象
	public void Test2(){
		Circle circle = new Circle();//创建对象
		double area = circle.area(3);//调用方法
		System.out.println(area);//打印结果
	}
}
