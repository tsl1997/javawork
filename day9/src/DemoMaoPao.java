public class DemoMaoPao {
	public static void main(String[] args) {
		//定义需要排序的数组
		int[] nums=new int[]{152,142,102,59,75,98,421};
		//打印原数组
		System.out.println("原数组为：");
		for (int a:nums){
			System.out.print(a+"\t");
		}
		//冒泡排序
		for (int i=0;i< nums.length-1;i++){
			for (int j=0;j< nums.length-i-1;j++){
				if (nums[j]<nums[j+1]){
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
				}
			}
		}
		//打印结果
		System.out.println("\n降序后数组为：");
		for (int a:nums){
			System.out.print(a+"\t");
		}
	}
}
