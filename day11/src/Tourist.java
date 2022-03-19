/**
 * 这是一个游客类*/
public class Tourist {
	/**
	 * 输入年龄，计算门票价格
	 * @param i 年龄*/
	public int ticket(int i){
		int ticketPrice=0;
		if (i>=18 && i<60){
			ticketPrice=20;
		}
		return ticketPrice;
	}
}
