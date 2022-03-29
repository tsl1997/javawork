package cn.homeWork.no4;

import org.junit.Test;

public class Tester {
	@Test //测试传统手机
	public void test1(){
		Handset c = new CommonHandset("摩托罗拉","P1");//创建对象，向上转型
		System.out.println(c);
		c.call();//打电话
		c.info();//发短信
		((PlayWiring)c).play();//向下转型
	}
	@Test //测试智能手机
	public void test2(){
		Handset a = new AptitudeHandst("华为", "P40");//创建对象，向上转型
		System.out.println(a);
		((Network)a).networkConn();//连接网络
		a.call();//打电话
		a.info();//发短信
		((AptitudeHandst)a).takePicture();//拍照
	}
}
