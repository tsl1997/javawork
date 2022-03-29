package cn.homeWork.no1;

public class Tester {
	public static void main(String[] args) {
		UsbInterface udisk = new Udisk();
		udisk.service();
		UsbInterface usbFengShan = new UsbFengShan();
		usbFengShan.service();
	}
}
