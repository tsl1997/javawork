/**
 * 这是一个测试类，计算器*/
public class CalculatorTest {
	public static void main(String[] args) {
		double c;
		c=new Calculator().add(5,10);//调用加法
		System.out.println(c);
		c=new Calculator().minus(5,10);//调用减法
		System.out.println(c);
		c=new Calculator().multiple(5,10);//调用乘法
		System.out.println(c);
		c=new Calculator().divide(5,10);//调用除法
		System.out.println(c);
	}
}
