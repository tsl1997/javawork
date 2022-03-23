package cn.k2503.seven;
/**这是一拳超人琦玉类——程序员类*/
public class QiYu extends Staff{
	//行为: 工作work:撸代码(用输出语句模拟)
	public String work(){
		return "撸代码";
	}

	public QiYu(String name, int number, int salary) {
		super(name, number, salary);
	}
	public String showInfo2() {
		return showInfo()+"\t"+work()+"\t工资："+getSalary();
	}
}
