package blockChain;

import java.util.Scanner;

/**这是一个测试类*/
public class Tester {
	/*
	* 我想写一个简易版本的区块链，其中的要求如下所示：
	*
	* 区块头：用当前的对象生成哈希码
	* 区块体：写入执行的内容，暂时用String代替
	* 区块尾：指向前一个区块头，形成链表(第一个应该为null或者是0）
	*
	* 查询：从当前最新的信息依次往上查找，知道第一个区块为止或者找到目标
	*
	* 写入：创建新的区块，写入上一个区块的头部
	*
	* 技术分析：区块是一个对象，包括三个部分，头和尾都是固定模式，区块体可以操作，需要一条最长链
	*
	*
	* */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LongChain l = new LongChain();//创建最长链操作对象
		Block[] blocks = l.blocks(5);//创建最长链
		blocks = l.dateBlocks(blocks);//初始化，创世区块

		do {
			System.out.println("请输入你要写入的内容：");
			String demo = sc.next();//用户输入的内容
			blocks = l.addBlocks(blocks, demo);//增加区块内容
			l.findBlocks(blocks);//查看最新的区块信息
			System.out.print("是否继续添加新的区块内容(y继续)？");
			String temp = sc.next();
			if (!temp.equalsIgnoreCase("y")){
				break;//当输入不是y时，退出输入
			}
		}while(true);
		System.out.println("是否输出所有的区块信息？(y查看，其他取消）");
		String isOK = sc.next();//判断用户是否查看
		if (isOK.equalsIgnoreCase("y")){
			l.findAllBlocks(blocks);
		}else{
			System.out.println("已经取消查看！");
		}
	}

}
