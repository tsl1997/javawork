package cn.homeWork.no4;

public class CommonHandset extends Handset implements PlayWiring{
	public CommonHandset(String brand, String type) {
		super(brand, type);
	}

	public CommonHandset() {
	}

	@Override
	public void call() {
		System.out.println("开始语言通话....");
	}

	@Override
	public void info() {
		System.out.println("发送文字短信....");

	}

	@Override
	public void play() {
		System.out.println("播放音乐《一剪梅》......");
	}
}
