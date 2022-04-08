package homeWork.no2;

import java.util.HashSet;
import java.util.Iterator;

public class Tester {
	public static void main(String[] args) {
		//1:数据
		HashSet<Dog> set = new HashSet<>();
		set.add(new Dog("欧欧","雪纳瑞"));
		set.add(new Dog("亚亚","拉布拉多"));
		set.add(new Dog("菲菲","拉布拉多"));
		set.add(new Dog("美美","雪纳瑞"));
		//2：逻辑
		System.out.println("共有"+set.size()+"条狗狗\n分别是：");
		Iterator<Dog> it = set.iterator();
		while(it.hasNext()){
			Dog n = it.next();
			System.out.println(n);
		}
	}
}
