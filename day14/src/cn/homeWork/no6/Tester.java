package cn.homeWork.no6;

public class Tester {
	public static void main(String[] args) {
		Computer computer = new Computer();//创建计算机对象
		CPUIntel cpuIntel = new CPUIntel();//创建CPU型号
		HardDisk3000G hardDisk3000G = new HardDisk3000G();//创建硬盘型号
		RAM4G ram4G = new RAM4G();//创建内存条
		//组装电脑
		computer.setCpu(cpuIntel);//插入CPU
		computer.setHardDisk(hardDisk3000G);//插入硬盘
		computer.setRam(ram4G);//插入内存条
		//开机测试
		System.out.println(computer);//打印信息
	}
}
