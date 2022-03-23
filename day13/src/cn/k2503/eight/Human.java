package cn.k2503.eight;
/**这是一个人类*/
public class Human {
	private String name;//姓名
	private double height;//身高

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		if (height < 0){
			this.height = 1;
			return; //身高不能为负数
		}
		this.height = height;
	}

	public Human(String name, double height) {
		setName(name);
		setHeight(height);
	}
}
