/**这是一个数组类*/
public class Array {
	/**数组里面插入一个数字*/
	public void insertArray(int [] arr, int  index, int  value){
		for  ( int  j = arr.length -  1 ; j >=index; j--) {  // 为要插入的数留出位置
			arr[j] = arr[j -  1 ];
		}
		arr[index- 1 ] = value;
	}
	/**打印所有数组信息*/
	public void print(int[] array){
		for (int a:array){
			System.out.print(a+"\t");
		}
	}
}
