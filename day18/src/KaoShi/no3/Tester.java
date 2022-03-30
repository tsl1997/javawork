package KaoShi.no3;

import org.junit.Test;

public class Tester {
	@Test //测试Flower对象
	public void Test1(){
		Flower flower = new Flower("红色",52.0);//建立对象
		flower.showInfo();//调用方法
	}
	@Test //测试Rose对象
	public void Test2(){
		Rose rose = new Rose("紫色",99.9,"巴黎");//建立对象
		rose.showInfo();//调用方法
		rose.warn();//调用警告
	}
}
