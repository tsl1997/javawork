package cn.k2503.car;

import java.util.Objects;

public class Bus extends Car{
	/**座位数*/
	private String seatNum;
	/**封装属性*/
	public String getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(String seatNum) {
		this.seatNum = seatNum;
	}
	/**无参构造*/
	public Bus() {
	}
	/**带参构造*/
	public Bus(String brand, String carNumber, int money, String seatNum) {
		super(brand, carNumber, money);
		this.seatNum = seatNum;
	}

	/**客车租金重写*/
	@Override
	public double calRent(int days, int money) {
		if(days >= 150){
			return money*days*0.6;//打6折
		}
		if(days >= 30){
			return money*days*0.7;//打7折
		}
		if(days >= 7){
			return money*days*0.8;//打8折
		}
		if(days >= 3){
			return money*days*0.9;//打9折
		}
		return money*days;//不打折
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Bus bus = (Bus) o;
		return Objects.equals(seatNum, bus.seatNum);
	}

	@Override
	public int hashCode() {
		return Objects.hash(seatNum);
	}
}
