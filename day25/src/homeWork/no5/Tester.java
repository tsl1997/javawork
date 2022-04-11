package homeWork.no5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {
	public static void main(String[] args){
		try {
			FileWriter fw = new FileWriter("src\\homeWork\\no5\\简介.txt");//创建对象
			char[] chars = "我热爱我的团队".toCharArray();//将文本转化为char数组
			fw.write(chars);//写入char数组内容
			fw.close();//关闭资源
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
