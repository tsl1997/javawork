package homeWork.no1;

import java.util.HashSet;
import java.util.Iterator;

public class Tester {
	public static void main(String[] args) {
		//1:数据
		HashSet<News> set = new HashSet<>();//创建集合
		set.add(new News(1,"高考"));
		set.add(new News(2,"汽车"));
		//2:逻辑
		System.out.println("新闻标题的数目为："+set.size()+"条");
		Iterator<News> it = set.iterator();
		while(it.hasNext()){
			News n = it.next();
			System.out.println(n.getName());
		}
		//3:打印
		System.out.println("----------------------");
		for(News e : set) {
			System.out.println(e.getName());
		}

	}
}
