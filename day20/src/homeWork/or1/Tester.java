package homeWork.or1;

public class Tester {
	public static void main(String[] args) {
		String str = "ababsdjkgsdnbabsdhaa";//定义一个目标字符串
		System.out.println(str.length());//获取字符串长度
		int[] num=new int[str.length()];//创建数组，记录出现的次数
		String strs="";//检查重复的备用
		for(int i=0;i<str.length();i++){
			String s = str.substring(i, i + 1);//获取该元素
			if (!strs.contains(s)){//当第一次出现时
				strs+=s;//存储该元素
				num[i]=1;//首次出现
			}else{
				num[strs.indexOf(s)]++;//次数也自增
			}
		}
		int max=0;
		String maxStr="";
		for (int i=0;i<str.length();i++){
			if(max<num[i]){
				max=num[i];//始终保存最大的次数
				maxStr=strs.substring(i,i+1);//始终保存出现最大的字符
			}
		}
		System.out.println("出现次数最多的是："+maxStr);
		System.out.println("总共出现了："+max+"次");


	}
}
