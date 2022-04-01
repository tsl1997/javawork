package cn.k2502.demo.cn.k2502.classJob;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DemoMath {
	public static void main(String[] args){
		/*System.out.println(Math.abs(-9));//打印绝对值
		System.out.println(Math.floor(-15.6));//地板，向下取最大处
		System.out.println(Math.round(-15.6));//四舍五入
		System.out.println(Math.ceil(-15.6));//天花板，向上取最小
		System.out.println((int)(Math.random()*10));
*/


	/*	Date now = new Date();
		System.out.println(now);
		long strat = System.currentTimeMillis();
		long i=0;
		while(i<100000000000L){
			i++;
		}
		long end = System.currentTimeMillis();
		System.out.println("执行时间是："+(end-strat));*/

		String str="1997-101-100886";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date birthday= null;
		try {
			birthday = sdf.parse(str);//将字符串转换为日期
		} catch (ParseException e) {
			e.printStackTrace();
		}
		SimpleDateFormat e = new SimpleDateFormat("E");
		String s=e.format(birthday);//将日期转字符串
		System.out.println(s);

	}
	@Test
	public void Test1(){
		Calendar cal = Calendar.getInstance();//创建对象
		cal.setLenient(false);
		cal.set(1997,10-1,6);//设置日期
		int year = cal.get(Calendar.YEAR);//年
		int month = cal.get(Calendar.MONTH);//月
		int date = cal.get(Calendar.DAY_OF_MONTH);//日
		int week = cal.get(Calendar.DAY_OF_WEEK+1);//星期

		System.out.println(year+"年"+
				month+"月"+
				date+"日"+
				"\t星期"+week);


	}
}
