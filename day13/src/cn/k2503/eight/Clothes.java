package cn.k2503.eight;
/**衣服类*/
public class Clothes {
	//属性:品牌,颜色
	private String brand;//品牌
	private String color;//颜色

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Clothes(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}
}
