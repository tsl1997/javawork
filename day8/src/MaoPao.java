public class MaoPao {
	public static void main(String[] args) {
		int[] arr={54,23,34,14,9};//定义数组
		for (int i = 0; i < arr.length-1; i++) {
			//j < arr.length-1 为了避免角标越界
			//j < arr.length-1-i 为了比较效率,避免重复比较
			//内层循环用来完成元素值比较，把大的元素值互换到后面
			for (int j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//输出结果
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
