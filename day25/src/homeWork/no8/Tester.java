package homeWork.no8;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {
	public static void main(String[] args){
		/*需求：在我的电脑中创建一个记事本文件，内容是“你a好”.
		要求：使用字符流读取时，char[]长度为2；字节流读取时byte[]长度也是2。
		最后在控制台输出读取的结果。*/
		//1:字符流读取文件
		FileReader fr = null;
		try {
			fr = new FileReader("src\\homeWork\\no8\\1.txt");
			//先取出来打印显示
			char[] chars = new char[2];
			int len;
			while((len=fr.read(chars)) != -1){
				System.out.print(new String(chars,0,len));//打印内容
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (fr!=null) {
					fr.close();//关闭资源
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		//2:字节流读取文件
		FileInputStream fi = null;
		try {
			fi = new FileInputStream("src\\homeWork\\no8\\1.txt");
			byte[] bytes = new byte[2];
			int len1;
			while((len1=fi.read(bytes)) != -1){
				System.out.print(new String(bytes,0,len1));//打印内容，取出的byte内容太小不足以显示
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (fi!=null) {
					fi.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}


	}
}
