package KaoShi.no3;

import java.io.PushbackInputStream;

public class Flower {
	private String color;//颜色
	private double price;//价格

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	/**全参构造*/
	public Flower(String color, double price) {
		this.color = color;
		this.price = price;
	}
	/**无参构造*/
	public Flower() {
	}
	/**输出打印信息*/
	public void showInfo() {
		System.out.println("花的颜色是："+getColor()+"，价格是："+getPrice());
	}
}
