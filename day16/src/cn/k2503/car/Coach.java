package cn.k2503.car;

import java.util.Objects;

public class Coach extends Car {
	/**型号*/
	private String type;
	/**封装属性*/
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	/**无参构造*/
	public Coach() {
	}
	/**带参构造*/
	public Coach(String brand, String carNumber, int money, String type) {
		super(brand, carNumber, money);
		this.type = type;
	}

	/**轿车租金重写*/
	@Override
	public double calRent(int days, int money) {
		if(days > 150){
			return money*days*0.7;//打7折
		}
		if(days > 30){
			return money*days*0.8;//打8折
		}
		if(days > 7){
			return money*days*0.9;//打9折
		}
		return money*days;//不打折
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Coach coach = (Coach) o;
		return Objects.equals(type, coach.type);
	}

	@Override
	public int hashCode() {
		return Objects.hash(type);
	}
}
