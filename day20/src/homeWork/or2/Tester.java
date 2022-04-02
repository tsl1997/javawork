package homeWork.or2;

public class Tester {
	public static void main(String[] args) {
		String str="woaijavahajajavavahajavaaiwo";//给定字符串
		String t="java";//需要删除的字符串
		int n=t.length();//获取删除字符串的长度
		int num=0;//统计次数
		while (true) {
			if (str.indexOf(t) >= 0) {
				int temp = str.indexOf(t);//判断目标出现的位置
				String str1 = str.substring(0, temp);//删除前
				String str2 = str.substring(temp + n, str.length());//删除后
				str = str1 + str2;//拼接字符串
				num++;//一次删除完成
			} else {
				System.out.println(str);//输出最后结果字符串
				System.out.println(num);//输出删除的次数
				break;
			}
		}
	}
}
