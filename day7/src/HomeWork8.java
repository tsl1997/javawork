public class HomeWork8 {
	public static void main(String[] args) {
		//1:定义数组
		int[] array=new int[]{1,3,-1,5,-2};
		int[] newArray=new int[array.length];
		//2:处理逻辑
		for (int i=0;i< array.length;i++){
			newArray[array.length-i-1] = array[i];//倒序
			if (array[i]<0){
				newArray[array.length-i-1] = 0;//将负数换成0
			}
		}
		//3：输出结果
		System.out.println("原数组为：");
		for (int i=0;i< array.length;i++){
			System.out.print(array[i]+"\t");
		}
		System.out.println();//换行；控制界面
		System.out.println("逆序并处理后的数组为：");
		for (int i=0;i< newArray.length;i++){
			System.out.print(newArray[i]+"\t");
		}
	}
}
