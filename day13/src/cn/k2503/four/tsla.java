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
			return "骑着"+getNumber()+"只轮子的"+getColor()+"的车";
		}else{
			return super.run();
		}
	}

	public tsla(int number, String color, boolean battery) {
		super(number, color);
		this.battery = battery;
	}
}
