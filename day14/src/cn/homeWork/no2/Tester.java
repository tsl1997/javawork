package cn.homeWork.no2;

import org.junit.Test;

public class Tester {
	@Test //第二题
	public  void Tester1() {
		Door t = new TheftproofDoor();//创建对象，向上转型
		t.openDoor();//开门
		t.closedDoor();//关门
		((Lock)t).openLock();//开锁，向下转型
		((TheftproofDoor)t).closeLock();//关锁，向下转型
	}
	@Test //第三题
	public  void Tester2() {
		Door t = new TheftproofDoor();//创建对象，向上转型
		t.openDoor();//开门
		t.closedDoor();//关门
		((Lock)t).openLock();//开锁，向下转型
		((doorBell)t).photograph();//铃铛拍照
		((TheftproofDoor)t).closeLock();//关锁，向下转型
	}
}
