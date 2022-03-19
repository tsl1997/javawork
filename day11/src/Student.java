import java.util.Scanner;

/**这是一个学生类*/
public class Student {
	public String[] names=new String[10];//学生姓名数组，这里存在一个隐患

	/**
	 * 输入学生信息并保存
	 * @param name 学生姓名*/
	public void addName(String name){
		//System.out.println("请输入学生姓名：");
		for (int i=0;i< names.length;i++){
			if (names[i]==null){//如果该数组不存在
				names[i]=name;//则把目标值赋给他
				break;
			}
		}
	}
	/**
	 * 查找学生
	 * @param a 开始查找的位置
	 * @param b 结束查找的位置
	 * @param name 查找的学生姓名*/
	public void findName(int a,int b,String name,String[] ns){
		System.out.println("----查找结果----");
		for (int i=a;i<=b;i++){
			if (ns[i].equals(name)){
				System.out.println("找到了！");
				return;
			}
		}
		System.out.println("找不到！");
	}
}
