package k2502;

import org.dom4j.Document;
import org.dom4j.Element;
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
}
