package cn.k2502.Car;
/**这是一个汽车类，父类*/
public abstract class Car {
	/**汽车品牌*/
	private String brand;
	/**汽车型号*/
	private String type;
	/**汽车车牌号*/
	private String carNumber;
	/**汽车座位数*/
	private String seatNum;
	/**汽车日租金*/
	private int money;
	/**汽车租聘天数*/
	private int days;

	//封装属性
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

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
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
		if (days <1){
			return; //非法值不允许输入
		}
		this.days = days;
	}
	/**租金计算*/
	public abstract double calRent(int days,int money);

}
