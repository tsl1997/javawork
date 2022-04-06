package cn.k2052;

import org.junit.Test;

public class StringTest {
	@Test
	public void test1() {
		String s1="a";
		String s2="B";
		String s3="$";
		String s4=s1.concat(s2).concat(s3);
		int num = s4.compareTo(s1);
		System.out.println("大小关系："+num);
		char c = s4.charAt(2);
		System.out.println(c);
	}

	@Test
	public  void test2() {
		String str="abc edf jj";//定义字符串
		String s1 = str.replaceAll(" ", "-");//替换内容
		String[] s2 = s1.split("-");//分割字符串
		System.out.println(s2.length);//输出数值长度
		for(String s:s2){
			System.out.println(s);//输出内容
		}
	}
}
