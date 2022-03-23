package cn.k2503.four;
/**这是一个自行车类*/
public class bicycle {
	/**属性:轮子个数,轮子颜色
      行为:跑(输出语句模拟:”蹬着跑”,输出语句中要有自行车的属性)*/
	private int number;//轮子个数
	private String color;//轮子颜色

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number < 0) {
			this.number =1;//轮子不能为负数
			return;
		}
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/**跑*/
	public String run() {
		return "蹬着跑";
	}
}
