package demo;

import org.junit.Test;

import java.io.File;

public class Tester {
	@Test
	public void Test1()throws Exception{
		File f=new File("C:\\Users\\huaxi\\Desktop\\上课内容\\笔记\\作业代码\\day20\\2.txt");
		boolean b=f.createNewFile();
		System.out.println(b);
		System.out.println(f);


	}
}
