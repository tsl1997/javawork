package cn.k2503.four;
/**这是一个电动车类*/
public class tsla extends bicycle{
	private boolean battery;//电池

	public boolean isBattery() {
		return battery;
	}

	public void setBattery(boolean battery) {
		this.battery = battery;
	}

	/**跑*/
	public String run() {
		if(battery) {
			return "骑着跑";
		}else{
			return "蹬着跑";
		}
	}

	public tsla(int number, String color, boolean battery) {
		super(number, color);
		this.battery = battery;
	}
}
