package cn.homeWork.no2;

public class TheftproofDoor extends Door implements Lock,doorBell{
	@Override
	public void openDoor() {
		System.out.println("用力推，门打开了。");
	}

	@Override
	public void closedDoor() {
		System.out.println("轻轻拉门，门关上了。");
	}

	@Override
	public void openLock() {
		System.out.println("插进钥匙，向右旋转钥匙三圈，锁打开了，拔出钥匙。");
	}

	@Override
	public void closeLock() {
		System.out.println("插进钥匙，向左旋转钥匙三圈，锁上了，拔出钥匙。");
	}

	@Override
	public void photograph() {
		System.out.println("铃铛.......叮叮叮.....照片已经存储");
	}
}
