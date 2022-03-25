package cn.k2502.homeWork4;
/**这是一个人类---员工类
 * 抽象类*/
public abstract class Person {
	private String name;//姓名
	private int number;//工号
	//封装属性
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number < 0) {
			return; //不合法时停止赋值
		}
		this.number = number;
	}
	/**无参构造*/
	public Person() {
	}
	/**带参构造*/
	public Person(String name, int number) {
		this.name = name;
		setNumber(number);
	}
	public abstract String work();
}
