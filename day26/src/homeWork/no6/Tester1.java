package homeWork.no6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Tester1 {
	public static void main(String[] args) throws Exception{
		//2.创建测试类，在测试类中，使用ObjectOutputStream对象序列化学生对象，保存到当前项目的info.txt中
		FileOutputStream fo = new FileOutputStream("src\\homeWork\\no6\\info.txt");
		ObjectOutputStream oo = new ObjectOutputStream(fo);
		Person p = new Person(4896, "江户川柯南", 10);//创建对象
		oo.writeObject(p);//写入对象内容
		oo.close();//导入了接口，应该就可以序列化了
	}
}
