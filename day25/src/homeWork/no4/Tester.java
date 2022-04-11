package homeWork.no4;

import java.io.FileReader;
import java.io.IOException;

public class Tester {
	public static void main(String[] args){
		try {
			FileReader fr = new FileReader("test5.txt");//创建对象
			char[] buf = new char[1024];//创建数组，缓存内容
			int len;
			while ((len = fr.read(buf)) != -1){
				System.out.println(new String(buf,0,len));
			}
			fr.close();//关闭资源
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
