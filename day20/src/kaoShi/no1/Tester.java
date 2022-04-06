package kaoShi.no1;

import java.util.Locale;

public class Tester {
	public static void main(String[] args) {
		String str="HelloWorld";//定义字符串
		char[] chars = str.toCharArray();//转换为char数组
		StringBuffer b = new StringBuffer();//创建对象
		for (int i=str.length()-1;i>=0;i--) {//倒序
			char temp=chars[i];
			if(temp>='A' && temp<='Z') {
				String s1 = (String.valueOf(temp)).toLowerCase();//大写换小写
				b.append(s1);//添加字符
				continue;
			}
			if(temp>='a' && temp<='z'){
				String s2 = (String.valueOf(temp)).toUpperCase();//小写换大写
				b.append(s2);
			}
		}
		System.out.println(b.toString());//输出结果
	}
}
