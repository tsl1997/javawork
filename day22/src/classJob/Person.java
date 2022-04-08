package classJob;

public class Person {
	private String ID;
	private String name;

	public String getID() {
		return ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}

	public Person() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Person{");
		sb.append("ID='").append(ID).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Person)) return false;

		Person person = (Person) o;

		return ID != null ? ID.equals(person.ID) : person.ID == null;
	}

	@Override
	public int hashCode() {
		return ID != null ? ID.hashCode() : 0;
	}
}
