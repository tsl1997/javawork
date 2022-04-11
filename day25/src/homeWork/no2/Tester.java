package homeWork.no2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Tester {
	public static void main(String[] args){
		FileOutputStream fo = null;//创建对象
		try {
			fo = new FileOutputStream("test2.txt",true);
			String str="好好学习，天天向上";//目标字符串
			byte[] bs = str.getBytes();//字符串编码为byte数组
			fo.write(bs,0,bs.length);//写入内容
			System.out.println("text2文件已经更新！");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fo!=null) {
					fo.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
