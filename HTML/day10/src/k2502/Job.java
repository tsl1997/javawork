package k2502;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

public class Job {
	public static void main(String[] args) throws Exception{
		SAXReader saxReader = new SAXReader();//创建对象
		Document read = saxReader.read("test.xml");//获取DOM信息
		List<Node> list = read.selectNodes("//phone");//获取所有的phone对象
		for(Node l:list){//遍历集合
			Element l1 = (Element) l;
			String brand = l1.attributeValue("brand");//获取品牌brand信息
			System.out.println("品牌："+brand);//打印品牌信息
			List<Element> type = l1.elements("type");//获取标签type集合
			for(Element e:type){
				String text = e.getText();//获取具体的型号信息
				System.out.println("\t\t型号"+text);//打印具体的型号信息
			}
		}
	}
}
