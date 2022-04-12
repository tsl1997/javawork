package homeWork.no3;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Tester {
	public static void main(String[] args)throws Exception{
		/*需求说明：读取包含中文的文本文件时，可能出现中文乱码，使用InputStreamReader并设置编码格式解决中文乱码问题，*/
		//已经把3.txt换成了GBK编码
		FileInputStream fi = new FileInputStream("src\\homeWork\\no3\\3.txt");
		InputStreamReader isr = new InputStreamReader(fi,"GBk");//带上编码
		char[] chars = new char[1024];//char数组保存
		int len;
		while ((len = isr.read(chars)) != -1){
			System.out.println(new String(chars,0,len));//输出内容
		}
		isr.close();
		fi.close();//关闭资源
	}
}
