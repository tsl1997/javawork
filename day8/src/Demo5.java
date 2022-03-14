public class Demo5 {
	public static void main(String[] args) {
		int[] height={170,180,178,181,165};
		for (int i=0;i< height.length-1;i++){
			for (int j=i+1;j< height.length;j++){
				if (height[i]>height[j]){
					int temp=height[j];
					height[j]=height[i];
					height[i]=temp;
				}
			}
		}
		for (int a:height){
			System.out.print(a+",");
		}
	}
}
