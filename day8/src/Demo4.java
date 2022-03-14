public class Demo4 {
	public static void main(String[] args) {
		int[] height={170,180,178,181,165};
		for (int i=0;i< height.length-1;i++){
			for (int j=0;j< height.length-i-1;j++){
				if (height[j]>height[j+1]){
					int temp=height[j];
					height[j]=height[j+1];
					height[j+1]=temp;
				}
			}
		}
		System.out.println("输出结果：");
		for (int a:height){
			System.out.print(a+"\t");
		}
	}
}
