package homeWork.no1;

import java.io.FileInputStream;
import java.io.IOException;

public class Tester {
	public static void main(String[] args) {
		FileInputStream fi = null;//创建对象
		try {//处理异常
			fi = new FileInputStream("test1.txt");
			byte[] bs = new byte[1024];//创建byte数组，保存数据
			int len;//定义长度返回值
			while ((len=fi.read(bs))!=-1){//当还有的时候循环
				String s = new String(bs, 0, len);//将byte数组转换为string
				System.out.println("可读取的字节："+len);
				System.out.println("文件内容为："+s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fi!=null) {
					fi.close();//关闭资源
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
