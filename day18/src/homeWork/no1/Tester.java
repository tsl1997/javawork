package homeWork.no1;

import org.junit.Test;

import java.util.InputMismatchException;

public class Tester {
	@Test
	public void Test1(){
		Demo demo = new Demo();
		int a=10;
		int b=0;
		int c = 0;
		try {
			c = demo.div(a, b);
			System.out.println("结果是："+c);
		} catch (InputMismatchException e) {
			System.err.println("数据类型不匹配");
		}catch(ArithmeticException e){
			System.err.println("除数不能是0");
		}catch(Exception e){
			System.err.println("程序升级中，请稍后再试。");
		} finally {
			System.out.println("感谢使用本程序！");
		}
	}


}
