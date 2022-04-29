package k2502;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import java.util.List;

public class tester {
	@Test
	public void test()throws Exception{
		SAXReader reader = new SAXReader();//获取对象
		Document read = reader.read("person.xml");//加入xml
		Element rootElement = read.getRootElement();//解析xml
		List<Element> elements = rootElement.elements();//获取子节点集合
		//System.out.println(elements.size());//打印节点的数量

		for(int i = 0; i < elements.size(); i++){
			Element first = elements.get(i);//获取第i个子节点
			List<Element> sonEles = first.elements();//获取孙子节点集合
			String text="";//重置字符串
			for(Element child : sonEles){//迭代孙子节点集合
				text += child.getText();//拼接字符串
			}
			System.out.println(text);//打印结果
		}

	}
	@Test
	public void test1()throws Exception{
		SAXReader saxReader = new SAXReader();
		Document read = saxReader.read("person.xml");
		List<Node> list = read.selectNodes("//person");//获取所以的带有id属性的标签集合
		list.remove(0);
		System.out.println(list);
		for(Node element : list){//比那里标签集合
			if(element instanceof Element) {
				Element e = (Element) element;//向下转型
				String name = e.elementText("name");//获取子节点的姓名
				String age = e.elementText("age");
				String sex = e.elementText("sex");
				System.out.println(name + " " + age + " " + sex);
			}
		}
	}
}
