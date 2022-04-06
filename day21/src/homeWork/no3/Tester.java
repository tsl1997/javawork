package homeWork.no3;

public class Tester {
	public static void main(String[] args) {
		/*需求说明：有一段歌词，每句都以空格“  ”结尾，请将歌词每句按行输出。
		使用String类提供了split()方法，将这段歌词分割为子字符串，结果作为字符串数组按照如图所示效果返回。*/
		//1:数据
		String str="长亭外 古道边 芳草碧连天 晚风扶 柳笛声残 夕阳山外山";
		//2：逻辑
		String[] s = str.split(" ");//分割字符串
		//3：打印结果
		System.out.println("原歌词是：");
		System.out.println(str);
		System.out.println("\n拆分后的歌词是：");
		for(String a:s){
			System.out.println(a);
		}
		//4：存在问题：空格增加的话没有一次性全部去掉
	}
}
