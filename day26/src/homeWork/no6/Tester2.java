package homeWork.no6;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Tester2 {
	public static void main(String[] args) throws Exception{
		//3.创建测试类2，在测试类2中，使用ObjectInputStream反序列化info.txt中保存的学生信息。输出读取到的学生信息
		FileInputStream fi = new FileInputStream("src\\homeWork\\no6\\info.txt");
		ObjectInputStream oi = new ObjectInputStream(fi);
		Object o = oi.readObject();//读取文件的对象内容
		Person o1 = (Person) o;//向下转型
		System.out.println(o1);//因为之前已经重写了toString
		oi.close();//关闭资源
	}
}
