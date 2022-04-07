package classJob;

public class Student {
	private int ID;
	private String name;//
	private String phone;//

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Student(int ID, String name, String phone) {
		this.ID = ID;
		this.name = name;
		this.phone = phone;
	}

	public Student() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append("ID=").append(ID);
		sb.append(", name='").append(name).append('\'');
		sb.append(", phone='").append(phone).append('\'');
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		return ID == student.ID;
	}

	@Override
	public int hashCode() {
		return ID;
	}
}
