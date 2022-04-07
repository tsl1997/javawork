package homeWork.no2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DogService {
	public static void main(String[] args) {
		List<Dog> dogs = new ArrayList<>();//创建狗狗对象集合
		dogs.add(new Dog("欧欧","雪纳瑞"));//添加元素
		dogs.add(new Dog("亚亚","拉布拉多"));
		dogs.add(new Dog("菲菲","拉布拉多"));
		dogs.add(new Dog("美美","雪纳瑞"));

		//1:打印信息
		System.out.println("共计有"+dogs.size()+"条狗狗");
		System.out.println("分别是：");
		Iterator<Dog> it = dogs.iterator();//迭代器
		while(it.hasNext()){
			Dog n = it.next();//获取元素
			System.out.println(n);//打印元素
		}

		//2:删除
		dogs.remove(new Dog("欧欧","不知道"));
		dogs.remove(new Dog("菲菲","不知道"));
		//打印信息
		System.out.println("删除之后还有"+dogs.size()+"条狗狗");
		System.out.println("分别是：");
		for(Dog d:dogs){
			System.out.println(d);//打印元素
		}

		//3:查找
		boolean b = dogs.contains(new Dog("美美", "不知道"));
		System.out.println("集合中"+(b?"包含":"不包含")+"美美的信息");//打印结果
	}
}
