package homeWork.no4;

public class Tester {
	public static void main(String[] args) {
		/*使用“+”和String类的concat()方法对字符串进行连接，实现如图所示的打印成绩单效果。
		（科目和成绩使用“+”连接，版权信息使用concat()方法连接）*/
		//1:数据+2逻辑
		String s1="***成绩单***";
		String s2="SQL"+80;
		String s3="Java"+90;
		String s4="HTML"+86.7;
		String s5="版权信息：".concat("北大青鸟");
		//3:打印输出
		System.out.println(s1);
		System.out.println(s2+"\t"+s3+"\t"+s4);
		System.out.println(s5);
	}
}
