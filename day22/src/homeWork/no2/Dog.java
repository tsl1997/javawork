package homeWork.no2;
/**这是一个狗狗类*/
public class Dog {
	private String type;
	private String name;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog(String name, String type) {
		this.type = type;
		this.name = name;
	}

	public Dog() {
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(name).append('\t');
		sb.append(type);
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Dog)) return false;

		Dog dog = (Dog) o;

		return name != null ? name.equals(dog.name) : dog.name == null;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}
