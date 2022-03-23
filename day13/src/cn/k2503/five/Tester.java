package cn.k2503.five;

import org.junit.Test;

public class Tester {

	@Test
	public void testMan(){
		Teacher teacher = new Teacher();//创建老师对象
		teacher.setName("李超");
		teacher.setAge(33);
		System.out.println(teacher.study());//输出结果

		Student student = new Student();
		student.setName("王志腾");
		student.setAge(12);
		System.out.println(student.study());//输出结果

	}
}
