import java.util.Arrays;

public class HomeWork4 {
	public static void main(String[] args) {
		//定义字符数组
		char[] a=new char[]{'a','c','u','b','e','p','f','z'};
		//输出查看
		System.out.print("原字符序列：");
		for (int i=0;i< a.length;i++){
			System.out.print(a[i]+"\t");
		}
		//升序
		Arrays.sort(a);
		System.out.print("\n升序排列后：");
		for (int i=0;i< a.length;i++){
			System.out.print(a[i]+"\t");
		}
		//查找固定的位置
		char findNUm='b';
		int find=Arrays.binarySearch(a,findNUm);
		System.out.print("\n'"+findNUm+"'在升序后的位置是："+find);
	}
}
