package homeWork.no8;

import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
	public static void main(String[] args) {
		//1:数据
		ArrayList<String> str = new ArrayList<>();//创建集合
		str.add("花谢花飞花满天");//添加元素
		str.add("APTX4869");
		str.add("120");
		str.add("1");
		str.add("Lolita");

		//2：逻辑
		for(int i=0;i<str.size();i++) {
			String[] split = str.get(i).split("\\D");//分割字符串
			if (split.length > 0) {//如果分割成功，就删除
				str.remove(i);//删除对象
				i--;//控制下标
			}
		}
		//3:打印信息
		for(String s:str){
			System.out.println(s);
		}
		//3-2:迭代器打印
		/*Iterator<String> it = str.iterator();
		while(it.hasNext()){
			String n = it.next();
			System.out.println(n);
		}*/
	}
}
