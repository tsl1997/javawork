package homeWork.no6;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Tester {
	public static void main(String[] args){
		FileReader fr = null;//创建对象、
		FileWriter fw = null;
		try {
			fr = new FileReader("src\\homeWork\\no6\\test.txt");
			char[] cs=new char[1024];
			int len;
			System.out.println("替换前：");
			while ((len = fr.read(cs)) != -1){
				String s = new String(cs, 0, len);
				System.out.println(s);
			}
			System.out.println("\n替换后：");
			fw = new FileWriter("src\\homeWork\\no6\\test.txt");
			String str="你好，我的名字是欧欧，我是一只狗狗。我的主人是李伟。";
			System.out.println(str);
			fw.write(str);//写入内容
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				if (fw!=null) {
					fw.close();
				}
				if (fr!=null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
