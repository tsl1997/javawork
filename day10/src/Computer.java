/**
 * 创建计算机类*/
public class Computer {
	/**
	 * CPU string*/
	public String cpu;
	/**
	 *主板 string*/
	public String zhuBan;
	/**
	 *显示器 string*/
	public String xianShiQi;
	/**
	 * 硬盘 string*/
	public String yingPan;
	/**
	 * 内存 string*/
	public String neiCun;

	/**
	 * 自我介绍*/
	public void showInfo(){
		System.out.println("CPU："+cpu+"\n主板："+zhuBan+"\n显示器："+xianShiQi+"\n硬盘："+yingPan+"\n内存："+neiCun);
	}
}
