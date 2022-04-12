package homeWork.no7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tester {
	public static void main(String[] args){
		/*需求说明：当图片star.jpg位于C盘根目录下时，使用字节流将此图片复制到D:\myDoc\myPicture.jpg。
		* 复制图片，我就酱1.jpg复制到no7目录下面*/
		//1:先用字节流读取文件
		//2:再讲字节流读取的内容写入到新文件
		FileInputStream fi = null;
		FileOutputStream fw = null;
		try {
			fi = new FileInputStream("1.jpg");
			fw = new FileOutputStream("src\\homeWork\\no7\\2.jpg");
			byte[] bs = new byte[1024];
			int len;
			while ((len = fi.read(bs)) != -1){//判断是否将读取完毕
				fw.write(bs,0,len);//写入内容
			}
			System.out.println("图片复制成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (fw!=null) {
					fw.close();
				}
				if (fi!=null) {
					fi.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
