package com.lintcode;

public class Tester1598 {
	public static void main(String[] args) {
		Solution s = new Solution();
		String a="abcd def abcd xyz";
		String b="ijk def ijk";
		String[] str = s.uncommonFromSentences(a, b);
		//打印输出
		for(String d:str){
			System.out.println(d);
		}

	}
}
