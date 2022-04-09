package homeWork.no7;

public class Student {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		return name != null ? name.equals(student.name) : student.name == null;
	}

	@Override
	public int hashCode() {
		return name != null ? name.hashCode() : 0;
	}
}
