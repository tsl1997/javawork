package homeWork.no6;

import java.io.Serializable;

public class Person implements Serializable {
	//1.创建学员类（属性：学号、学生姓名、学生年龄）
	private int ID;
	private String name;
	private int age;//年龄

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

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

	public Person() {
	}

	public Person(int ID, String name, int age) {
		this.ID = ID;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Person{");
		sb.append("ID=").append(ID);
		sb.append(", name='").append(name).append('\'');
		sb.append(", age=").append(age);
		sb.append('}');
		return sb.toString();
	}
}
