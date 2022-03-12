public class HomeWork6 {
	public static void main(String[] args) {
		//某百货商场当日消费积分最高的八名顾客，他们的积分分别是：18,25,7,36,13,2,89,63.
		// 编写程序找出最低的积分及它在数组中原始的位置（下标）
		//1:定义数组和数据
		int[] nums={18,25,7,36,13,2,89,63};
		int min=nums[0];//假设第一个元素最小
		int numIndex=-1;//位置索引，负数表示无意义
		//2：求最小值和所在的位置
		for (int i=1;i< nums.length;i++){
			if (min>nums[i]){
				min=nums[i];//min永远是最小值
				numIndex=i;
			}
		}
		//3：输出结果
		System.out.println("最低的积分："+min);
		//4：如果第一个元素就是最小值，numIndex将为-1，程序bug。
		// 在输出前，先询问一下，numIndex小于0吗？是：索引为0；否，索引为numIndex
		System.out.print("最低积分所在数组的位置：");
		if (numIndex<0){
			System.out.println(0);
		}else{
			System.out.print(numIndex);
		}
	}
}
