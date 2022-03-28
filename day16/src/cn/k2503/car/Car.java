package cn.k2503.car;
/**这是一个父类车类*/
public abstract class Car {
	/**品牌*/
	private String brand;
	/**车牌号*/
	private String carNumber;
	/**日租金*/
	private int money;
	/**租聘日期*/
	private int days;
	/**封装属性*/
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}
	/**无参构造*/
	public Car() {
	}
	/**带参构造(日期由用户输入）*/
	public Car(String brand, String carNumber, int money) {
		this.brand = brand;
		this.carNumber = carNumber;
		this.money = money;
	}
	/**重写toString*/
	@Override
	public String toString() {
		return "Car{" +
				"brand='" + brand + '\'' +
				", carNumber='" + carNumber + '\'' +
				", money=" + money +
				'}';
	}
	/**抽象方法，强制重写租金计算*/
	public abstract double calRent(int days,int money);
}
