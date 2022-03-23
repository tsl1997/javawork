package cn.k2503.seven;

import org.junit.Test;

public class Tester {
	@Test
	public void method(){
		Manager bai = new Manager("白子画", 10086, 88888, 66666);
		System.out.println(bai.showInfo2());//打印结果

		QiYu qiYu = new QiYu("琦玉",10,5201);
		System.out.println(qiYu.showInfo2());
	}
}
