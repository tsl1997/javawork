package homeWork.no7;

import java.util.ArrayList;
import java.util.Collections;

public class Tester4 {
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<>();
		Collections.addAll(ints,888,666,520,521,518);
		Collections.sort(ints);
		System.out.println("正序排列：");
		for(Integer i:ints){
			System.out.println(i);
		}
		Collections.reverse(ints);
		System.out.println("倒序排列：");
		for(Integer i:ints){
			System.out.println(i);
		}
	}
}
