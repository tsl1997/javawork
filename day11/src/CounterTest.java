import java.sql.SQLOutput;
import java.util.Calendar;

public class CounterTest {
	public static void main(String[] args) {
		int sum=new Counter().add(5,6,9);//调用方法
		System.out.println("和是："+sum);

		int[] nums={12,23,34,43,45,67};//创建数组
		int sum2=new Counter().adds(nums);//传入数组参数
		System.out.println("多个整数求和是："+sum2);
	}
}
