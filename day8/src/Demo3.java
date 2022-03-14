public class Demo3 {
	public static void main(String[] args) {
		int[]	array=new int[]{1,-3,-1,5,-2};
		int[]	newArray=new int[array.length];

		for (int i= array.length-1;i>=0;i--){
			if (array[i]<0){
				continue;
			}
			newArray[array.length-1-i]=array[i];
		}

		System.out.println("逆序后新数组为：");
		for (int i=0;i< newArray.length;i++){
			System.out.print(newArray[i]+"\t");
		}
	}
}
