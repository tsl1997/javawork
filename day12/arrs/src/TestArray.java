public class TestArray {
	public static void main(String[] args) {
		Array arr = new Array();
		int[] array = new int[]{45,55,41,54,87,95,47,65,98,73};//定义数组
		System.out.println("原数组为：");
		arr.print(array);//打印数组
		arr.insertArray(array,5,88);//插入数据，第五个位置，插入88
		System.out.println("\n插入后数组为：");
		arr.print(array);//打印数组
	}
}
