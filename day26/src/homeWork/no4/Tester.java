package homeWork.no4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Tester {
	public static void main(String[] args) throws Exception{
		/*使用BufferedReader缓冲流读取模板文件C:\pet.template的内容，
		按照pet.template的模板格式保存宠物数据到文本文件体的宠物信息，使用BufferedWriter将替换，即把{name}、{type}、{master}
		替换为具后的内容写入到C:\myDoc\pet.txt中*/
		FileReader fr = new FileReader("src\\homeWork\\no4\\4.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		s = br.readLine();
		System.out.println(s);//打印读取到的内容
			//字符串处理
		s = s.replace("{name}", "小白");//替换字符串
		s = s.replace("{type}","中华田园犬");
		s = s.replace("{master}","黑曼巴");
		System.out.println(s);
		FileWriter fw = new FileWriter("src\\homeWork\\no4\\4.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(s);//写入文件中
		bw.close();
		br.close();//关闭资源
	}
}
