package classJob;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Tester3 {
	@Test
	public void test(){
		ArrayList<String> strs = new ArrayList<>();
		strs.add("454");
		strs.add("8448");
		Iterator<String> it = strs.iterator();
		while(it.hasNext()){
			it.next();
			it.remove();
		}

		System.out.println(strs.size());
	}
}
