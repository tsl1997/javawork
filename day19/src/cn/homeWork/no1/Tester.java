package cn.homeWork.no1;

import org.junit.Test;

public class Tester {
	@Test
	public void Test1(){
		Integer i=12;//自动装箱
		System.out.println(i);//自动拆箱
	}

	@Test
	public void Test2(){
		Double i=Double.valueOf(3.14);//手动装箱
		System.out.println(i.doubleValue());//手动拆箱
	}

	@Test //8种类型
	public void Test3() {
		//手动装箱
		Integer num1=Integer.valueOf(5);//手动装箱
		Byte num2=Byte.valueOf((byte)1);//强制类型转换，手动装箱
		Short num3=Short.valueOf((short)52);//强制类型转换，手动装箱
		Long num4=Long.valueOf(666L);
		Character num5= Character.valueOf('a');
		Boolean num6=Boolean.valueOf(true);
		Double num7=Double.valueOf(3.14);
		Float num8=Float.valueOf(3.66F);
		//手动拆箱
		int a1=num1.intValue();
		byte a2=num2.byteValue();
		short a3=num3.shortValue();
		long a4=num4.longValue();
		char a5=num5.charValue();
		boolean a6=num6.booleanValue();
		double a7=num7.doubleValue();
		float a8=num8.floatValue();

	}

	@Test //自动装箱和拆箱
	public void Test4(){
		//自动装箱
		Integer num1=1;
		Byte num2=2;
		Short num3=3;
		Long num4=4L;
		Character num5='艹';
		Boolean num6=true;
		Double num7=3.14;
		Float num8=5.20F;
		//自动拆箱
		int a1=num1;
		byte a2=num2;
		short a3=num3;
		long a4=num4;
		char a5=num5;
		boolean a6=num6;
		double a7=num7;
		float a8=num8;

	}
}
