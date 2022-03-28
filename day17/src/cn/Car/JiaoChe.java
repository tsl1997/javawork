package cn.Car;

import java.util.Objects;

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
	/**带参构造*/
	public JiaoChe(String brand,String type) {
		setBrand(brand);
		this.type = type;
	}

	@Override
	public String toString() {
		return "JiaoChe{" +super.toString()+
				"type='" + type + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof JiaoChe)) return false;

		JiaoChe jiaoChe = (JiaoChe) o;
		if (this.getBrand()!=null && !this.getBrand().equals(jiaoChe.getBrand()))return false;

		return type != null ? type.equals(jiaoChe.type) : jiaoChe.type == null;
	}

	@Override
	public int hashCode() {
		int result = getBrand()!=null?getBrand().hashCode():0;
		result = 31*result +getType()!=null?getType().hashCode():0;
		return result;
	}
}
