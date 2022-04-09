package homeWork.no8;

public class Student {
	private String name;
	private String no;
	private double score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Student() {
	}

	public Student(String name, String no, double score) {
		this.name = name;
		this.no = no;
		this.score = score;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		if (name != null ? !name.equals(student.name) : student.name != null) return false;
		return no != null ? no.equals(student.no) : student.no == null;
	}

	@Override
	public int hashCode() {
		int result = name != null ? name.hashCode() : 0;
		result = 31 * result + (no != null ? no.hashCode() : 0);
		return result;
	}
}
