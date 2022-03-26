package cn.k2502.classJob;

import java.util.Objects;

/**这是一个人类*/
public abstract class Person {
	private String name;//姓名
	private int age;//年龄
	/**封装属性*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age<0){
			return; //合法判断
		}
		this.age = age;
	}

	public Person() {
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "姓名是：" + name + '\'' +
				"年龄是：" + age;
	}

	public abstract String work();
}
