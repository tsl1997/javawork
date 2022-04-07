package homeWork.no4;

import homeWork.no2.Dog;

import java.util.LinkedList;

public class DogServiceLinkedList {
	public static void main(String[] args) {
		LinkedList<Dog> dogs = new LinkedList<>();//创建狗狗链表
		dogs.add(new Dog("欧欧","雪纳瑞"));//添加元素
		dogs.add(new Dog("亚亚","拉布拉多"));
		dogs.add(new Dog("菲菲","拉布拉多"));
		dogs.add(new Dog("美美","雪纳瑞"));
		//1：打印信息
		System.out.println("第一条狗狗的昵称是："+dogs.getFirst().getName());
		System.out.println("最后一条狗狗的昵称是："+dogs.getLast().getName());
		//2:删除
		dogs.removeFirst();//删除第一条
		dogs.removeLast();//删除最后一条
		//3:输出结果
		System.out.println("删除部分狗狗后还"+dogs.size()+"有条狗狗");
		System.out.println("分别是：");
		for(Dog d:dogs){
			System.out.println(d);//打印狗狗信息
		}
	}
}
