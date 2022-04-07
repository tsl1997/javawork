package homeWork.no3;

import homeWork.no1.News;

import java.util.LinkedList;

public class NewsServiceLinkedList {
	public static void main(String[] args) {
		LinkedList<News> news = new LinkedList<>();//创建链表集合
		news.add(new News(1,"汽车","admin"));//添加元素
		news.add(new News(2,"医美","admin"));
		//打印信息
		News first = news.getFirst();
		System.out.println("头条的新闻标题为："+first.getName());//获取新闻标题
		News last = news.getLast();
		System.out.println("排在最后的新闻标题为："+last.getName());//获取新闻标题
		News firstR = news.removeFirst();
		System.out.println("删除的头条的新闻标题为："+firstR.getName());//获取删除新闻标题
		News lastR = news.removeLast();
		System.out.println("删除的末条的新闻标题为："+lastR.getName());//获取新闻标题
		System.out.println("删除后剩余的新闻条数："+news.size());
	}
}
