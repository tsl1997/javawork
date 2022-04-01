package cn.homeWork.no5;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	@Test
	public void Test1()throws Exception{
		String str = "2017-09-05";//设置格式
		SimpleDateFormat sdf = new SimpleDateFormat();//创建对象
		Date date = sdf.parse(str);//转换格式
		System.out.println(date);//打印结果
	}
	@Test
	public void Test2(){
		Date date = new Date();//获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//创建对象
		String str = sdf.format(date);//格式转化
		System.out.println(str);//打印结果
	}
}
