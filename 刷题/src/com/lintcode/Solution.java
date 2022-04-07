package com.lintcode;



import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**lintcode1598题目：
 * 给定两个句子 A 和 B 。 （句子是一串由空格分隔的单词。每个单词仅由小写字母组成。）
 * 如果一个单词在其中一个句子中只出现一次，在另一个句子中却没有出现，那么这个单词就是不常见的。
 * 返回所有不常用单词的列表。
 * 您可以按任何顺序返回列表。*/
public class Solution {
	/**
	 * @param A: Sentence A
	 * @param B: Sentence B
	 * @return: Uncommon Words from Two Sentences
	 */
	public String[] uncommonFromSentences(String A, String B) {
	/*	// Write your code here.
		Map<String, Integer> count = new HashMap();//创就应该哈希表
		for (String word: A.split(" "))//取出字符串数组内容
			count.put(word, count.getOrDefault(word, 0) + 1);//添加内容，如果有次数加一
		for (String word: B.split(" "))
			count.put(word, count.getOrDefault(word, 0) + 1);

		List<String> ans = new LinkedList();//创建链表
		for (String word: count.keySet())//去出哈希保存内容
			if (count.get(word) == 1)//如果该内容次数是1
				ans.add(word);//那么在链表里面添加该内容

		return ans.toArray(new String[ans.size()]);//返回链表，以数组的形式
		这是推荐算法，下面是自己做的狗屎代码*/

		// Write your code here.
		String[] a = A.split(" ");//分割字符串
		String[] b = B.split(" ");//分割字符串
		String[] str = new String[a.length+b.length];//开辟最大空间范围
		//int maxLen = a.length > b.length ? a.length : b.length;//返回最长字符串数
		//2:逻辑

		for (int i = 0; i < a.length; i++) {
			boolean is = false;
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j])) {
					is = true;
					break;
				}
			}
			for(int q=0;q<a.length; q++) {
				if(i==q){
					continue;
				}
				if(a[i].equals(a[q])){
					is = true;
					break;
				}
			}
			if (!is) {
				for (int k = 0; k < str.length; k++) {
					if (str[k] == null) {
						str[k] = a[i];
						break;
					}
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			boolean is = false;
			for (int j = 0; j < a.length; j++) {
				if (b[i].equals(a[j])) {
					is = true;
					break;
				}
			}
			for(int q=0;q<b.length; q++) {
				if(i==q){
					continue;
				}
				if(b[i].equals(b[q])){
					is = true;
					break;
				}
			}
			if (!is) {
				for(int k=0;k<str.length;k++) {
					if (str[k] == null) {
						str[k] = b[i];
						break;
					}
				}
			}
		}
		int temp=0;
		for (int i = 0; i < str.length; i++) {
			if(str[i]==null){
				temp=i;
				break;
			}
			temp=str.length;
		}
		String[] strings = new String[temp];
		for (int i = 0; i < strings.length; i++) {
			strings[i]=str[i];
		}
		return strings;
	}

}

