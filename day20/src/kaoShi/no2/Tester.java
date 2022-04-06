package kaoShi.no2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tester {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();//创建对象
		c.setLenient(false);
		Date time = c.getTime();//获取当前时间
		//System.out.println(time);//打印当前时间Date
		c.add(Calendar.DATE,100);//当前天数增加100天
		Date time1 = c.getTime();//获取修改后的时间
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy"+"年"+"MM"+"月"+"dd"+"日");//创建对象
		String result = sdf.format(time1);//格式化对象
		System.out.println(result);//打印结果

	}
}
