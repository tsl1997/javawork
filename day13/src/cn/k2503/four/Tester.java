package cn.k2503.four;

import org.junit.Test;

/**这是测试类*/
public class Tester {
	@Test
	public void testTsla(){
		tsla tsla1 = new tsla(4,"白色",true);
		tsla tsla2 = new tsla(2,"黑色",false);
		System.out.println(tsla1.run());//输出第一个
		System.out.println(tsla2.run());//输出第二个
	}
}
