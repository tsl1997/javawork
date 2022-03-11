public class Homework2 {
	public static void main(String[] args) {
		//2、使用while循环结构输出：100,95,90,85,... ...,5。先画流程图，再编程实现。
		// 设置断点调试程序，观察循环变量的变化。
		int i = 100;//定义循环变量，给最开始的值100
		while (i>0){
			if (i%5==0){//当i被5整除时
				System.out.print(i+",");//输出i的值
			}
			i-=5;//循环变量-5
		}
	}
}
