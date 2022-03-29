package cn.homeWork.no1;

public class Udisk implements UsbInterface{

	@Override
	public void service() {
		System.out.println("连接USB接口，开始传输数据！");
	}
}
