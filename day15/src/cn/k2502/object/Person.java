package cn.k2502.object;

import java.util.Objects;

/**这是人类*/
public class Person {
	private String id;
	private String name;
	private char sex;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}
	/**全参构造*/
	public Person(String id, String name, char sex) {
		this.id = id;
		this.name = name;
		this.sex = sex;
	}
	/**重写toString*/
	@Override
	public String toString() {
		return "Person{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", sex=" + sex +
				'}';
	}
	/**重写equals*/
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Person person = (Person) o;
		return id.equals(person.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
