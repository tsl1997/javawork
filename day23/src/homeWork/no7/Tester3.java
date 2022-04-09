package homeWork.no7;



import java.util.ArrayList;
import java.util.Collections;

public class Tester3 {
	public static void main(String[] args) {
		//1；数据
		ArrayList<String> strs = new ArrayList<>();
		Collections.addAll(strs,"id","play","makeLove","go","10086","me");
		//2:逻辑
		String max = Collections.max(strs);
		String min = Collections.min(strs);
		Collections.sort(strs);
		//3:输出结果
		System.out.println("最大值："+max);
		System.out.println("最小值："+min);
		System.out.println("数组升序：");
		for(String s:strs){
			System.out.println(s);
		}
		Collections.reverse(strs);//反转
		System.out.println("数组倒序：");
		for(String s:strs){
			System.out.println(s);
		}

	}
}
