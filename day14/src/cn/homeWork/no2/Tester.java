package cn.homeWork.no2;

public class Tester {
	public static void main(String[] args) {
		Door t = new TheftproofDoor();//创建对象，向上转型
		t.openDoor();//开门
		t.closedDoor();//关门
		((Lock)t).openLock();//开锁，向下转型
		((TheftproofDoor)t).closeLock();//关锁，向下转型
	}
}
