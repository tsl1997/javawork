package homeWork.no7;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Tester1 {
	@Test //利用 字符数组,FileReader，FileWriter将a.txt拷贝到当前工程下的b.txt中,异常不需要处理,抛出即可(throws)
	public void test1() throws Exception{
		FileReader fr = new FileReader("src\\homeWork\\no7\\a.txt");//读取
		FileWriter fw = new FileWriter("src\\homeWork\\no7\\b.txt");//写入
		char[] cs = new char[1024];
		int len;
		while ((len = fr.read(cs)) != -1){
			fw.write(cs, 0, len);//写入读取到的char数组内容
		}
		System.out.println("FileReader复制完成！");//给一句提示，避免太单调了
		fw.close();
		fr.close();//关闭资源
	}
	@Test //利用 BufferedReader和BufferedWriter将a.txt拷贝到当前工程下的c.txt中,异常不需要处理,抛出即可(throws)
	public void Test2()throws Exception{
		FileReader fr = new FileReader("src\\homeWork\\no7\\a.txt");//读取
		BufferedReader br = new BufferedReader(fr);//缓冲流
		FileWriter fw = new FileWriter("src\\homeWork\\no7\\c.txt");//忘记改了
		BufferedWriter bw = new BufferedWriter(fw);
		//简单来说，缓冲流就是一个装饰设计模式，将原本的对象变得更加好用
		char[] cs = new char[1024];
		int len;
		while ((len = br.read(cs)) != -1){
			bw.write(cs, 0, len);//写入读取到的char数组内容
		}
		System.out.println("FileReader复制完成！");//给一句提示，避免太单调了
		bw.close();
		br.close();//关闭资源
	}

}
