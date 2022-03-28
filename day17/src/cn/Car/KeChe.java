package cn.Car;

public class KeChe extends Che{
	private int seatNum;//座位数

	public int getSeatNum() {
		return seatNum;
	}

	public void setSeatNum(int seatNum) {
		this.seatNum = seatNum;
	}

	@Override
	public double getDiscount() {
		if (getDays()>=150){
			return 0.6;
		}else if (getDays()>=30){
			return 0.7;
		}else if (getDays()>=7){
			return 0.8;
		}else if (getDays()>=3){
			return 0.9;
		}
		return 1.0;
	}

	public KeChe() {
	}

	public KeChe(String brand, String carNo, double money, int seatNum) {
		super(brand, carNo, money);
		this.seatNum = seatNum;
	}

	@Override
	public String toString() {
		return "KeChe{" +super.toString()+
				"seatNum=" + seatNum +
				'}';
	}

}
