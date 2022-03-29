package cn.homeWork.no4;
/**这是一个手机类*/
public abstract class Handset {
	/**品牌*/
	private String brand;
	/**型号*/
	private String type;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Handset(String brand, String type) {
		this.brand = brand;
		this.type = type;
	}

	public Handset() {
	}

	@Override
	public String toString() {
		return "这是一款型号为" + type+ "的" + brand + "手机";
	}
	/**打电话抽象*/
	public abstract void call();
	/**发短信抽象*/
	public abstract void info();
}
