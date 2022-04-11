package kaoShi.no5;

public class Student {
	private String name;
	private int ID;
	private int score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Student() {
	}

	public Student(String name, int ID, int score) {
		this.name = name;
		this.ID = ID;
		this.score = score;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Student{");
		sb.append("name='").append(name).append('\'');
		sb.append(", ID=").append(ID);
		sb.append(", score=").append(score);
		sb.append('}');
		return sb.toString();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		return score == student.score;
	}

	@Override
	public int hashCode() {
		return score;
	}
}
