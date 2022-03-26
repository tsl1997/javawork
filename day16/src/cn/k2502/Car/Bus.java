package cn.k2502.Car;

public class Bus extends Car{
	@Override
	public double calRent(int days,int money) {
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
}
