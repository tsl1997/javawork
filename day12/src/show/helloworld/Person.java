package show.helloworld;

public class Person {
	public String name;
	public int age;
	public String sex;

	public String showInfo(){
		return "姓名是："+name+"年龄是："+age+"性别是："+sex;
	}

	public Person(String name, int age, String sex) {
		this(name, age);
		this.sex = sex;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(){
	}
}
