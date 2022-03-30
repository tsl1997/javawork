package KaoShi.no4;

public class Person {
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
	/**全参构造*/
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	/**无参构造*/
	public Person() {
	}
	/**重写equals*/
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;

		Person person = (Person) o;

		return name != null ? name.equals(person.name) : person.name == null;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}
