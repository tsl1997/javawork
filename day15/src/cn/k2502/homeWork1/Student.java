package cn.k2502.homeWork1;
/**课后第一题
 * 这是学生类*/
public class Student {
	//	（属性：姓名、成绩；方法：显示个人成绩）。
	private String name;
	private int score;
	/**封装属性*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}
	/**设置合法范围*/
	public void setScore(int score) {
		if (score < 0 || score>100){
			return; //当输入数据不合法时，停止输入
		}
		this.score = score;
	}
	/**无参构造*/
	public Student() {
	}
	/**带参构造*/
	public Student(String name, int score) {
		setName(name);
		setScore(score);
	}
	/**重写自我介绍*/
	@Override
	public String toString() {
		return "Student{" +
				"name='" + name + '\'' +
				", score=" + score +
				'}';
	}
}
