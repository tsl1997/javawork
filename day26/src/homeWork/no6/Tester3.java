package homeWork.no6;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;

public class Tester3 {
	/*扩展：使用ObjectInputStream和ObjectOutputStream实现多个学生对象的序列化和反序列化。*/
	//所以这里就用单元测试来实现
	@Test  //批量写入对象到文件
	public void test()throws Exception{
		//需要该变的内容是，保存多个对象，比如外卖创建一个对象数组，然后遍历数组，把遍历的元素以此保存
		FileOutputStream fo = new FileOutputStream("src\\homeWork\\no6\\info2.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		Person p = new Person(4896, "江户川柯南", 10);//创建对象
		Person p1 = new Person(666, "毛利小五郎", 40);//创建对象
		Person p2 = new Person(520, "毛利兰", 20);//创建对象
		Person p3 = new Person(1314, "灰原哀", 10);//创建对象
		Person p4 = new Person(8888, "目暮警官", 40);//创建对象
		ArrayList<Person> list = new ArrayList<>();//创建集合
		list.add(p);//添加元素
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);//我们测试一下批量写入对象看看
		//遍历list集合，依次写入内容到文件中，我们修改一下文件
		for(Person l:list){//增强for 取出Person对象
			oo.writeObject(l);//我这里错了，应该是写入多个对象的
		}
		oo.close();//导入了接口，应该就可以序列化了
	}
	@Test //批量读取文件里面的对象内容
	public void test1()throws Exception{
		FileInputStream fi = new FileInputStream("src\\homeWork\\no6\\info2.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Object o;
		try {
			while((o = oi.readObject())!=null) {//读取文件的对象内容
				//Person o1 = (Person) o;//向下转型,这不是必须的，Object是一切对象的父类，
				// 当你重写了toString方法后，父类可以直接调用，避免了向下转型会遇到的异常
				System.out.println(o);//多个对象最后也出问题了，我想想看
			}
		} catch (Exception e) {
			//e.printStackTrace();//假装自己会了，自欺欺人，明天问老师去，下了下了
		}
		oi.close();//关闭资源
	}
}
