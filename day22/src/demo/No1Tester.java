package demo;

import org.junit.Test;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class No1Tester {
	@Test
	public  void test(){
		HashMap<String, String> str = new HashMap<>();
		str.put("刘亦菲","小龙女");
		str.put("鸡大宝","伍六七");
		if(str.containsKey("鸡大宝")){
			str.put("鸡大宝","阿强");
		}
		str.put("刘亦菲","XX");//覆盖就是修改
		Set<Map.Entry<String, String>> e = str.entrySet();
		Iterator<Map.Entry<String, String>> it = e.iterator();
		while(it.hasNext()){
			Map.Entry<String, String> n = it.next();
			System.out.println(n.getKey() + ":" + n.getValue());
		}
	}
	@Test
	public void test2()throws Exception{
		File t = new File("1.txt");
		boolean b=t.createNewFile();
		System.out.println(b);
		boolean d = t.delete();
		System.out.println(d);
		/*File job = new File("Job");
		boolean n = job.mkdir();
		System.out.println(n);
		File f3=new File("Job\\4.jpg");//在abc下创建一个4.jpg
		boolean b3=f3.createNewFile();
		System.out.println(b3);*/


	}
}
