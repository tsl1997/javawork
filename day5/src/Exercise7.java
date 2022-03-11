public class Exercise7 {
	public static void main(String[] args) {
		int i =0;//定义循环变量
		int sun =0;//定义求和变量
		while (i<=100){
			if (i%2==0){//判断是否被2整除
				sun+=i;//如果是偶数就累加
			}
			i++;//循环变量自增，防止死循环
		}
		System.out.println(sun);//输出最后结果
	}
}