package KaoShi.no5;

public abstract class Person {
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
		this.age = age;
	}

	public abstract void eat();//抽象方法，吃饭
	/**全参构造*/
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**无参构造*/
	public Person() {
	}
}
