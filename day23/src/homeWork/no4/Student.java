package homeWork.no4;

public class Student {
	private String name;
	private char sex;

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

	public Student(String name, char sex) {
		this.name = name;
		this.sex = sex;
	}

	public Student() {
	}

}
