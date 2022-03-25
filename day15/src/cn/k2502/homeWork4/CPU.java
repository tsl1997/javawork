package cn.k2502.homeWork4;

public class CPU extends Maintain{
	public CPU() {
	}

	public CPU(String name, int number) {
		super(name, number);
	}

	@Override
	public String work() {
		return "硬件维护工程师：员工工号为："+getNumber()+"的"+getName()+"员工，正在修复打印机";
	}
}
