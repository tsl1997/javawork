package cn.Car;

public class JiaoChe extends Che{
	private String type;//型号

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public double getDiscount() {
		if (getDays()>150){
			return 0.7;
		}else if (getDays()>30){
			return 0.8;
		}else if (getDays()>7){
			return 0.9;
		}
		return 1.0;
	}

	public JiaoChe() {
	}

	public JiaoChe(String brand, String carNo, double money, String type) {
		super(brand, carNo, money);
		this.type = type;
	}

	@Override
	public String toString() {
		return "JiaoChe{" +super.toString()+
				"type='" + type + '\'' +
				'}';
	}
}
