package homeWork.no2;

public class Student {
	private String name;
	private double score;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public Student() {
	}

	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Student)) return false;

		Student student = (Student) o;

		return Double.compare(student.score, score) == 0;
	}

	@Override
	public int hashCode() {
		long temp = Double.doubleToLongBits(score);
		return (int) (temp ^ (temp >>> 32));
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append(name).append('\t');
		sb.append(score);
		return sb.toString();
	}
}
