package demo.student;

import java.util.Comparator;

public class StudentComparable implements Comparator<Student> {

	@Override //成绩升序
	public int compare(Student o1, Student o2) {
		return o1.getScore()-o2.getScore();
	}
}
