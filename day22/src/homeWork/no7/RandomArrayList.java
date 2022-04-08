package homeWork.no7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class RandomArrayList {
	public static void main(String[] args) {
		//1:数据
		Random random = new Random();//创建随机数类
		ArrayList<Integer> nums = new ArrayList<>();//创建集合
		nums.add(random.nextInt(99) + 1);//随机第一个数字
		for(int i=0;i<9;i++){
			int temp;
			do {
				 temp= random.nextInt(99) + 1;//临时数据
			}while(nums.contains(temp));//检查是否有重复
			nums.add(temp);
		}
		//2:逻辑---排序
		int size=nums.size();//获取个数
		for(int i=0;i<size;i++){//泡沫排序
			for(int j=0;j<size-1;j++){
				if(nums.get(j)>nums.get(j+1)){
					int temp=nums.get(j);//数据交换
					nums.set(j,nums.get(j+1));
					nums.set(j+1,temp);
				}
			}
		}
		//3：打印数据信息
		Iterator<Integer> it = nums.iterator();//迭代器
		while(it.hasNext()){
			Integer n = it.next();//获取元素
			System.out.println(n);//打印元素
		}
	}
}
