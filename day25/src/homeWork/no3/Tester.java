package homeWork.no3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {
	public static void main(String[] args){
		//因为我没有D盘，所以我就用作业2的文件复制到本代码同目录下面
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("test2.txt");
			fw = new FileWriter("src\\homeWork\\no3\\test.txt");
			char[] words=new char[1024];
			int len;
			while ((len = fr.read(words))!=-1){
				String s = new String(words, 0, len);//char数组转string
				fw.write(s);//写入string内容
			}
			System.out.println("复制完成，请查看文件！");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fw != null) {
					fw.close();//后开先关
				}
				if (fr!=null) {
					fr.close();//先开后关
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
