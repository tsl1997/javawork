package cn.homeWork.no2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tester2 {
	public static void main(String[] args) {
		Date date = new Date();//创建对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置是格式
		String f = sdf.format(date);//转换格式
		System.out.println("当前时间："+f);//输出结果
	}
}
