package cn.homeWork.no4;

public class AptitudeHandst extends Handset implements TheakePictures,Network{
	public AptitudeHandst(String brand, String type) {
		super(brand, type);
	}

	public AptitudeHandst() {
	}

	@Override
	public void call() {
		System.out.println("开始视频通话....");
	}

	@Override
	public void info() {
		System.out.println("发送文字和带有图片的短信....");
	}

	@Override
	public void networkConn() {
		System.out.println("连接网络成功！");
	}

	@Override
	public void takePicture() {
		System.out.println("咔嚓----拍照成功！");
	}
}
