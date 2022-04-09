package classJob;

public class Student {
	private int ID;
	private String name;
	private char sex;

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

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

	public Student(int ID, String name, char sex) {
		this.ID = ID;
		this.name = name;
		this.sex = sex;
	}

	public Student() {
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("ID=").append(ID);
		sb.append(", name='").append(name).append('\'');
		sb.append(", sex=").append(sex);
		return sb.toString();
	}
}
