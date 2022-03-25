package cn.k2502.homeWork2;

import java.util.Objects;

/**课后第二题*/
public class Student {
	//	重写equals()方法，如果学员学号（id）、姓名（name）都相同，
	private String ID;
	private String name;
	/**封装属性*/
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
	/**全参构造*/
	public Student(String ID, String name) {
		this.ID = ID;
		this.name = name;
	}
	/**无参构造*/
	public Student() {
	}
	/**重写equals*/
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Student student = (Student) o;
		return ID.equals(student.ID) && name.equals(student.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(ID, name);
	}
}
