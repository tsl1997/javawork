package demo.no3;

public class Year {
	//static静态修饰
	public static Boolean isRunYear(int year) {
		return (year%4==0&&year%100!=0)||(year%400==0);//闰年判断
	}
}
