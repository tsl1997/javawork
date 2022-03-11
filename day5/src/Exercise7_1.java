public class Exercise7_1 {
	public static void main(String[] args) {
		int i = 0;
		int sun = 0;
		do {
			if (i%2==0){
				sun+=i;
			}
			i++;
		}while (i<=100);
		System.out.print(sun);
	}
}
