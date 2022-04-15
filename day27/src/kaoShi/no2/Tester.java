package kaoShi.no2;

public class Tester {
	public static void main(String[] args) {
		String demo="HelloWorld";//目标字符串
		char[] cs = demo.toCharArray();//获取字符数组
		StringBuffer sb = new StringBuffer();//
		for(int i=cs.length-1; i>=0; i--) {
			char c=cs[i];//取出字符
			String s="";//定义要转换的字符
			if(c>'A' && c<'Z'){
				s = String.valueOf(c).toLowerCase();//转换小写
			}
			if(c>'a'&&c<'z'){
				s = String.valueOf(c).toUpperCase();
			}
			sb.append(s);//依次添加
		}
		System.out.println(sb.toString());//打印输出
	}
}
