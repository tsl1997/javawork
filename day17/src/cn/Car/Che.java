package cn.Car;

import java.util.Objects;

/**这是一个车类*/
public abstract class Che {
	private String brand;//品牌
	private String carNo;//车牌号
	private double money;//租金
	private double days;//天数
	private double discount;//折扣

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public double getDays() {
		return days;
	}

	public void setDays(double days) {
		this.days = days;
	}

	public abstract double getDiscount();

	/**无参构造*/
	public Che() {
	}
	/**全参构造
	 * @param brand 品牌
	 * @param carNo 车牌号
	 * @param days 天数
	 * @param money 租金
	 * @param discount 折扣*/
	public Che(String brand, String carNo, double money, double days, double discount) {
		this.brand = brand;
		this.carNo = carNo;
		this.money = money;
		this.days = days;
		this.discount = discount;
	}
	/**带参构造
	 * @param brand 品牌
	 * @param carNo 车牌号
	 * @param money 租金*/
	public Che(String brand, String carNo, double money) {
		this.brand = brand;
		this.carNo = carNo;
		this.money = money;
	}

	/**重写toString*/
	@Override
	public String toString() {
		return "Che{" +
				"brand='" + brand + '\'' +
				", carNo='" + carNo + '\'' +
				", money=" + money +
				", days=" + days +
				", discount=" + discount +
				'}';
	}
	/**计算租金*/
	public double giveMoney() {
		return getMoney()*getDays()*getDiscount();
	}


}
