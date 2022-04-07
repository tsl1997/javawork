package homeWork.no7;

public class Tester {
	public static void main(String[] args) {
		/*有一个字符串"woaijavahajajavavahajavaaiwo"删除该字符串中所有的"java"
		并且统计删除了多少个“java”将删除完的字符串和删除个数在控制台打印出来*/
		String s="woaijavahajajavavahajavaaiwo";
		String d="java";
		int n=d.length();//获取删除字符串的长度
		int num=0;//统计次数
		while (true) {
			if (s.indexOf(d) >= 0) {
				int temp = s.indexOf(d);//判断目标出现的位置
				String str1 = s.substring(0, temp);//删除前
				String str2 = s.substring(temp + n);//删除后
				s = str1 + str2;//拼接字符串
				num++;//一次删除完成
			} else {
				System.out.println(s);//输出最后结果字符串
				System.out.println(num);//输出删除的次数
				break;
			}
		}
	}
}
