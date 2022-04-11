package classJob;
import org.junit.Test;

import java.io.*;

public class Tester1File {
	@Test //写入字符
	public void fileWrite()throws IOException {
		FileWriter fw = new FileWriter("1.txt");//创建对象
		String demo="我爱你中国，我爱你武汉";//创建数据
		fw.write(demo);//传递数据
		fw.close();//关闭资源流
	}
	@Test //一次性读取一个字符
	public void fileReader()throws IOException {
		FileReader fr = new FileReader("1.txt");
		int read;
		while ((read = fr.read()) != -1) {
			System.out.print((char)read);
		}
	}
	@Test //一次性读取多个字符
	public void fileReader2()throws IOException {
		FileReader fr = new FileReader("1.txt");
		char[] cs=new char[1024];//一次性读取1024个字符
		int len;
		while ((len = fr.read(cs)) != -1) {
			String str=new String(cs,0,len);//将char数组转换为字符串
			System.out.print(str);
		}
	}
	@Test //写入文件，复制图片
	public void Test3()throws IOException{
		FileInputStream fi = null;
		FileOutputStream fo = null;
		long start = 0;
		long end = 0;
		try {
			fi = new FileInputStream("C:\\Users\\huaxi\\Pictures\\头像JPG\\猴子19.png");
			fo = new FileOutputStream("C:\\Users\\huaxi\\Desktop\\上课内容\\笔记\\作业代码\\day24\\1.png");
			byte[] bs = new byte[1024];
			int len;
			start = System.currentTimeMillis();
			while ((len = fi.read(bs))!=-1){
				fo.write(bs,0,len);
			}
			end = System.currentTimeMillis();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fo!=null) {
					fo.close();
				}
				if (fi!=null) {
					fi.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("操作成功！用时ms："+(end-start));
	}







}
