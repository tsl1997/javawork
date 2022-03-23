package cn.k2503.six;

public class Human {
	private String name;//姓名
	private int age;//年龄

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
		if (age <= 0 || age>100){
			this.age = 1;
			return; //人类年龄不能为负数
		}
		this.age = age;
	}
	/**带参构造*/
	public Human(String name) {
		this.name = name;
	}
}
