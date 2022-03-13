public class XuanZhe {
	public static void main(String[] args) {
		int[] arr={123,234,109,213,423,899};
		for (int i = 0; i < arr.length-1; i++) {
			//内层循环用来完成元素值比较，把小的元素值互换到要比较的第一个元素中
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		//输出结果
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
	}
}
