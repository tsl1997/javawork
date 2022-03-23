package cn.k2503.two;

import org.junit.Test;

public class Tester1 {
	@Test
	public void TestPet1() {
		Dog1 dog1 = new Dog1("小白",99,99);
		System.out.println(dog1.showInfo());//小白叫一下

	}
}
