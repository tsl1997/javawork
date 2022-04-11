package kaoShi.no3;

import java.util.Date;

public class Tester {
	public static void main(String[] args)throws Exception{
		DateUtil dateUtil = new DateUtil();//创建对象
		Date date = new Date();
		String s = dateUtil.dateToString(date);//测试date转换string
		System.out.println(s);
		Date date1 = dateUtil.stringToDate(s);//测试string转date
		System.out.println(date1);
	}
}
