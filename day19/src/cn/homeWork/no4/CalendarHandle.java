package cn.homeWork.no4;

import java.util.Calendar;

public class CalendarHandle {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();//创建对象
		cal.setLenient(false);
		cal.set(2014,11-1,13-1);//设置日期
		int year = cal.get(Calendar.YEAR);//年
		int month = cal.get(Calendar.MONTH);//月
		int day = cal.get(Calendar.DAY_OF_MONTH);//日
		int week = cal.get(Calendar.DAY_OF_WEEK);//星期中的第几天
		/*打印结果*/
		System.out.println("今天是："+year+"年"+
				(month+1)+"月"+
				(day+1)+"日"+
				"\n今天是星期"+week);
	}
}
