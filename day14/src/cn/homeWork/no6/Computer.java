package cn.homeWork.no6;
/**这一个计算机类*/
public class Computer {
	private CPU cpu;
	private HardDisk hardDisk;
	private RAM ram;

	public CPU getCpu() {
		return cpu;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public HardDisk getHardDisk() {
		return hardDisk;
	}

	public void setHardDisk(HardDisk hardDisk) {
		this.hardDisk = hardDisk;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}
	/**重写toString输出结果*/
	@Override
	public String toString() {
		return  "计算机的信息如下：\n" + cpu.getCPUInfo() + "\n"
				+ hardDisk.getHardDiskInfo() + "\n" + ram.getRAmInfo() ;
	}
}
