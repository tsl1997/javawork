package cn.k2502.demo;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class Tester1 {
	@Test //初次尝试HashMap对象
	public void Test1(){
		//创建对象
		Map a = new HashMap();
		//属性赋值
		a.put("姓名","张三");
		a.put("年龄",18);
		a.put("性别",'男');
		//打印结果
		System.out.println(a);
		//打印具体结果
		System.out.println(a.get("姓名"));
	}

	@Test //
	public void Test2(){
		Integer i1=129;//自动装箱
		Integer i2=129;
		System.out.println(i1==i2);//false:地址
		System.out.println(i1.equals(i2));//true:值

	}
}
