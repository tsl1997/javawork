package blockChain;

import java.util.Scanner;

/**最长链*/
public class LongChain {
	/**生成最长链
	 * @param i 最长链的长度*/
	public Block[] blocks(int i){
		Block[] blocks = new Block[i];//生成一个关于Block的对象数组
		return blocks;//返回对象数组
	}
	/**初始化*/
	public Block[] dateBlocks(Block[] blocks){
		blocks[0]=new Block();//创建创世区块
		blocks[0].setFirstNUmber(blocks[0].hashCode());//将对象的哈希码存入到区块头中
		blocks[0].setBockDemo("创世区块开启成功！");//写入创世内容
		return blocks;//换回数组
	}
	/**生成一个区块*/
	public Block[] addBlocks(Block[] blocks,String demo){
		//先判断原来的最长链，需要传入最长链
		//当最长链的某个对象为null时生成对象，区块尾为前一个区块的头，所以需要索引
		//区块头依旧生成，最后返回最长链
		for (int i=0;i<blocks.length; i++){
			if (blocks[0]==null){//如果第一个区块没有数据的话
				System.out.println("项目没有初始化，请初始化后再尝试！");
				break;//如果没有初始化，就停止运行
			}
			if (blocks[blocks.length-1]!=null){//如果最后一个区块已经有数据的话
				System.out.println("最长链已经使用完，请先增加最长链！");
				break;
			}
			if (blocks[i]==null){//寻找新区块空位
				blocks[i]=new Block();//创建新区块对象
				blocks[i].setFirstNUmber(blocks[i].hashCode());//生成区块头
				blocks[i].setLastNumber(blocks[i-1].getFirstNUmber());//自动链接，生成区块尾
				blocks[i].setBockDemo(demo);//填入传入的区块内容
				break;
			}
		}
		return blocks;
	}
	/**查看当前区块*/
	public void findBlocks(Block[] blocks){
		for (int i = 0; i < blocks.length; i++){
			if (blocks[i]==null){//如果区块是空，那么就输出前一个区块的信息
				System.out.println("---------------------------------");
				System.out.println("当前区块高度："+i);
				System.out.println(blocks[i-1]);//输出默认的toString信息
				break;
			}
		}
	}
	/**查看所以区块信息*/
	public void findAllBlocks(Block[] blocks){
		//1:寻找当前的最新区块
		int first=0;
		for(int i=0; i<blocks.length; i++){
			if(blocks[i]==null){
				first=i;//将最新区块的索引赋值给first
				break;
			}
		}
		//遍历输出
		for (int i=0; i<first; i++){
			System.out.println("---------------------------------");
			System.out.println("当前区块高度："+(i+1));
			System.out.println(blocks[i]);//输出默认的toString信息
		}
	}


}
