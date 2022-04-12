package homeWork.no9;

import java.io.*;

public class Tester {
	public static void main(String[] args){
		//与字节流FileOutputStream类实现文本文件读取步骤极其相似。按照如下的四个步骤，
		// 使用 DataOutputStream写二进制文件,程序执行后，两个文件在硬盘的信息如下图所示。
		FileInputStream fi = null;
		DataInputStream di = null;
		FileOutputStream fo = null;
		DataOutputStream dOut = null;
		try {
			fi = new FileInputStream("1.jpg");
			di = new DataInputStream(fi);
			fo = new FileOutputStream("src\\homeWork\\no9\\2.jpg");
			dOut = new DataOutputStream(fo);
			byte[] bytes = new byte[1024];
			int len;
			while ((len = di.read(bytes)) != -1){//读取数据，并判断
				dOut.write(bytes, 0, len);//写入数据
			}
			System.out.println("数据交换成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (dOut!=null) {
					dOut.close();
				}
				if (fo!=null) {
					fo.close();
				}
				if (di!=null) {
					di.close();
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
