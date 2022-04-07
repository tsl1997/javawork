package homeWork.no1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NewsService {
	public static void main(String[] args) {
		List<News> news = new ArrayList<>();//创建集合对象
		news.add(new News(1,"汽车","admin"));//添加元素
		news.add(new News(2,"高考","admin"));
		int size = news.size();//获取元素个数
		System.out.println("新闻标题的数目为："+size+"条");//打印信息
		for(int i=0;i<size;i++){
			System.out.println(news.get(i));//打印元素信息
		}
		/* //增强for
		for(News s:news){
			System.out.println(s);
		}
		//迭代器
		Iterator<News> it = news.iterator();
		while(it.hasNext()){
			News n = it.next();
			System.out.println(n);
		}*/
	}
}
