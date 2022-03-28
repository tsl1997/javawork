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

	public KeChe(String brand,int seatNum) {
		setBrand(brand);
		this.seatNum = seatNum;
	}

	@Override
	public String toString() {
		return "KeChe{" +super.toString()+
				"seatNum=" + seatNum +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof KeChe)) return false;

		KeChe keChe = (KeChe) o;
		if (this.getBrand()!=null && !this.getBrand().equals(keChe.getBrand()))return false;

		return seatNum == keChe.seatNum;
	}

	@Override
	public int hashCode() {
		int result= getBrand()!=null? getBrand().hashCode() : 0;
		result=31*result+getSeatNum()!=0?getSeatNum():0;
		return result;
	}
}
