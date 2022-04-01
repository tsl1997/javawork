package cn.homeWork.no3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateHandle {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//设置是格式
		String f = sdf.format(date);//转换格式
		System.out.println("当前日期为："+f);//输出结果

		Calendar cal = Calendar.getInstance();//创建对象
		cal.setLenient(false);
		cal.set(2014,4-1,6);//设置日期
		int year = cal.get(Calendar.YEAR);//年
		int month = cal.get(Calendar.MONTH);//月
		int day = cal.get(Calendar.DAY_OF_MONTH);//日
		int week = cal.get(Calendar.WEEK_OF_YEAR);//年内第几个星期
		/*打印结果*/
		System.out.println(year+"年"+
				(month+1)+"月"+
				day+"日"+
				"是一年中的第"+week+"星期");

	}
}
