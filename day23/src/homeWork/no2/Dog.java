package homeWork.no2;

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

	public Dog(String type, String name) {
		this.type = type;
		this.name = name;
	}

	public Dog(String name) {
		this.name = name;
	}

	public Dog() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Dog)) return false;

		Dog dog = (Dog) o;

		if (type != null ? !type.equals(dog.type) : dog.type != null) return false;
		return name != null ? name.equals(dog.name) : dog.name == null;
	}

	@Override
	public int hashCode() {
		int result = type != null ? type.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(type);
		sb.append("\t").append(name);
		return sb.toString();
	}
}