public class HomeWork1 {
	public static void main(String[] args) {
		/*（1）5个数字如何存放：（数组，数组.length = 5）
		（2）控制比较多少轮：（外层循环，循环变量 i）
		（3）控制每轮比较多少次：（内层循环，循环变量 j）
		（4）交换数据；
		使用二重循环实现如图所示的冒泡排序。*/
		//1:定义数组
		int[] array=new int[]{23,13,6,89,67};
		//2:交换数据-冒泡排序
		for (int i=0;i< array.length;i++){
			for (int j=0;j< array.length-1;j++){
				if (array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		//3：输出结果
		System.out.println("冒泡排序后：");
		for (int a:array){
			System.out.print(a+"\t");
		}
	}
}
