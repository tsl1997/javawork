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
			fo = new FileOutputStream("2.png");
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
	@Test //字节流读取TXT文本
	public void test3()throws IOException{
		FileInputStream fi = new FileInputStream("1.txt");
		byte[] bytes = new byte[1024];
		int len;
		while((len=fi.read(bytes))!=-1){
			String s = new String(bytes, 0, len);//将char数组转换成字符串
			System.out.println(s);
		}
		fi.close();
	}
	@Test //字节流写入TXT文本
	public void text4()throws IOException{
		FileOutputStream fo = new FileOutputStream("1.txt", true);
		byte[] bArr="尝试写入的内容".getBytes();//复制粘贴方法 getBytes编码
		fo.write(bArr);//尝试写入内容
		fo.close();//关闭资源
	}
	/*
	* IO流
	* I：input输入，读取
	* O：output输出，写入
	* 流：数据交换的状态(即数据在内存和硬盘中的通道流动）
	* 分类：字节流和字符流
	* 字节流：
	* 	InputStream
	* 	OutputStream
	* 字符流：
	* 	Reader
	* 	Writer
	* 区别：
	* 字符流只能操作字符类型的文件，即可以用记事本打开的人可以看懂的文件。
	* 字节流可以操作一切文件。
	* 常用方法：
	* close()关闭资源，当通道关闭后再次调用方法写入或者读取会发生异常
	* flush()刷新缓存区，当使用字符流时，java底层默认有缓存区1024大小，当使用时会提交数据交换，或者在使用close时刷新。
	* 读取文件：
	* redd()
	* 写入文件：
	* write()
	* 读取和写入都支持一次性保存多个数据，在字符流时使用的是char[]，在字节流时使用byte[]
	* 字节流的时候，如果需要打印显示，需要解码，同理存入的时候需要编码
	* */







}
