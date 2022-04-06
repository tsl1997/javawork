package demo;

import org.junit.Test;
/**这是一个测试String类*/
public class StringTester {
	@Test //字符串大小写
	public  void testCase(){
		String str="aDmin";
		String strUpperCase = str.toUpperCase();//UpperCase大写
		String strLowerCase = str.toLowerCase();//LowerCase小写
		System.out.println(strUpperCase);
		System.out.println(strLowerCase);
	}

	@Test //字符串换字符数组
	public void testChar(){
		String str="admin";
		char[] chArr=str.toCharArray();//字符串转字符数组
		String str1 = new String(chArr);//字符数组转字符串
		System.out.println(chArr);
		System.out.println(str1);
	}

	@Test //判断字符串
	public  void testEquals(){
		String str="admin java";
		boolean strStarts = str.startsWith("admin");//判断字符串开头 startsWith以...开始
		boolean strEnds = str.endsWith("java");//判断字符串结束 endsWith以...结束
		boolean strContains = str.contains("min");//判断是否包含 contain包含
		boolean strEquals = str.equals("admin java");//判断是否相同 equal等于
		System.out.println(strStarts);
		System.out.println(strEnds);
		System.out.println(strContains);
		System.out.println(strEquals);
	}

	@Test //获取字符串
	public void testAt(){
		String str="admin java";
		int length = str.length();//length长度
		String substring = str.substring(3);//sub子 获取从某个位置开始的字符串
		String substring1 = str.substring(3, 5);// [开始位置，结束位置)
		char c = str.charAt(3);//At 在 获取制定位置的字符
		System.out.println(length);
		System.out.println(substring);
		System.out.println(substring1);
		System.out.println(c);
	}

	@Test //字符串处理
	public void test1(){
		String str="   admin java   ";
		String trim = str.trim();//trim修建 去掉首尾空格
		int a = str.indexOf("a");//index索引 indexOf首次出现的位置
		int lastStr = str.lastIndexOf("a");//最后一次出现的位置
		System.out.println(str);
		System.out.println(trim);
		System.out.println(a);
		System.out.println(lastStr);
	}

	@Test //StringBuilder
	public void testStringBuilder(){
		StringBuilder str = new StringBuilder();//创建一个容器对象 Builder建造者
		str.append("admin");//append附加 string
		str.append(new char[]{'1','2','3'});//附加 char[]
		str.append(true);//附加 boolean
		str.append(3.14);//附加 double
		System.out.println(str);
	}

}
