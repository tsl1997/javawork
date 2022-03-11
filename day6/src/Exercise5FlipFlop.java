import java.util.Scanner;

public class Exercise5FlipFlop {
	public static void main(String[] args) {
		/*day06课后必做作业，第5题：
		* 5.它从1计数到100，遇到3的倍数就输出单词“Flip”，遇到5的倍数就输出单词“Flop”，
		* 遇到即为3的倍数又为5的倍数则输出单词“FlipFlop”，其余情况下输出当前数字。
		* */
		for (int i=1;i<=100;i++){
			if (i%3==0){
				if (i%5==0){
					System.out.println("FlipFlop");
				}
				System.out.println("Flip");
			}
			if (i%5==0){
				System.out.println("Flop");
			}
			System.out.println(i);
		}
	}
}
