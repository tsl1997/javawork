package cn.k2503.seven;
/**这是经理类*/
public class Manager extends Staff{
		/*奖金
	 行为：工作work:分配项目任务(用输出语句模拟)*/
	/**奖金*/
	private int bonus;

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		if (bonus<0){
			bonus=1;
			return; //奖金不能为负数
		}
		this.bonus = bonus;
	}

	public Manager(String name, int number, int salary, int bonus) {
		super(name, number, salary);
		setBonus(bonus);
	}

	/**分配项目任务*/
	public String work(){
		return "分配项目任务";
	}

	public String showInfo2() {
		return showInfo()+"\t"+work()+"\t工资："+getSalary()+"\t奖金"+getBonus();
	}
}
