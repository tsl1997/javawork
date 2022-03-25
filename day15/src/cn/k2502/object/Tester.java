package cn.k2502.object;

import org.junit.Test;

public class Tester {
	@Test
	public void personTest() {
		Person p1 = new Person("42011719961006255X","李白",'男');
		Person p2 = new Person("42011719961006255X","李白",'男');
		System.out.println(p1);
		System.out.println(p1==p2);
		System.out.println(p1.equals(p2));
	}
}
