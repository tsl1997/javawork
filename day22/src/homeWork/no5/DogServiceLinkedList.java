package homeWork.no5;

import homeWork.no2.Dog;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class DogServiceLinkedList {
	public static void main(String[] args) {
		List<Dog> dogs = new LinkedList<>();//创建狗狗链表
		dogs.add(new Dog("欧欧","雪纳瑞"));//添加元素
		dogs.add(new Dog("亚亚","拉布拉多"));
		dogs.add(new Dog("菲菲","拉布拉多"));
		dogs.add(new Dog("美美","雪纳瑞"));
		//1：打印信息
		System.out.println("所有的狗狗昵称和品种分别是：");
		Iterator<Dog> it = dogs.iterator();//创建迭代器
		while(it.hasNext()){//迭代判断
			Dog d = it.next();//取出元素
			System.out.println(d);//打印元素
		}
	}
}
