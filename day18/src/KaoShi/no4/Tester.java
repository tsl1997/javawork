package KaoShi.no4;

import org.junit.Test;

public class Tester {
	@Test
	public void Test1(){
		Person p1 = new Person("张三",15);//创建第一个人
		Person p2 = new Person("张三",50);//创建第二个人
		if (p1.equals(p2)){//判断是否相同
			System.out.println("是同一个人");
		}else{
			System.out.println("不是同一个人");
		}
	}
}
