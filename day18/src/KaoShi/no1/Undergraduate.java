package KaoShi.no1;
/**这是一个大学生类*/
public class Undergraduate extends Student{
	private String degree;//学位

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	/**全参构造*/
	public Undergraduate(String name, int age, String degree) {
		super(name, age);
		this.degree = degree;
	}
	/**无参构造*/
	public Undergraduate() {
	}
	/**重写show方法*/
	@Override
	public void show() {
		System.out.println("学位是："+degree);
	}
}
