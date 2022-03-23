package cn.k2503.seven;
/**这是一个员工类*/
public class Staff {
	/*属性:姓名 工号  工资
  行为:工作work(没有具体的工作行为)*/
	private String name;
	private int number;//工号
	private int salary;//薪水

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
			this.number=1;
			return; //编号不为负数
		}
		this.number = number;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		if(salary < 0) {
			this.salary = 1;
			return;//薪水不为负数
		}
		this.salary = salary;
	}
	/**啥事不干*/
	public String work(){
		return "";
	}

	public Staff(String name, int number, int salary) {
		setName(name);
		setNumber(number);
		setSalary(salary);
	}

	public String showInfo() {
		return getName()+"\t工号："+getNumber();
	}
}
