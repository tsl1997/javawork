package cn.k2503.six;

import org.junit.Test;

public class Tester {
	@Test
	public void TestStudent(){
		Student student = new Student("雪莉",88,99,55);
		System.out.println(student.getSum());//输出分数
	}
}
