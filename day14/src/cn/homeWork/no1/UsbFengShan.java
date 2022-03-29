package cn.homeWork.no1;

public class UsbFengShan implements UsbInterface{
	@Override
	public void service() {
		System.out.println("连接usB口，获得电流，风扇开始转动。");
	}
}
