package homeWork.no2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Tester {
	public static void main(String[] args) throws Exception{
		/*需求说明：按照如下的四个步骤，使用BufferedWriter和FileWriter类写文本文件,
		程序执行后，读取该文件的效果如下图所示。*/
		FileWriter fw = new FileWriter("src\\homeWork\\no2\\2.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);//找外援
		bw.newLine();//换行
		bw.write("hello");//写入内容
		bw.newLine();//换行
		bw.write("这是第二行内容");
		bw.close();
		fw.close();//关闭资源
	}
}
