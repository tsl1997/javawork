public class Demo2 {
	public static void main(String[] args) {
		//java入门到入土,p77,训练4，春晓古诗
		String[][] poetry={{"春","眠","不","觉","晓"},{"处","处","闻","啼","鸟"},
					      {"夜","来","风","雨","声"},{"花","落","知","多","少"}};

		System.out.println("横着打印春晓：");
		for (int i=0;i< poetry.length;i++){
			for (int j=0;j<poetry[i].length;j++){
				System.out.print(poetry[i][j]);
			}
			System.out.println();
		}

		System.out.println("\n竖着打印春晓：");
		for (int i=0;i<poetry[0].length;i++){
			for (int j=0;j<poetry.length;j++){
				System.out.print(poetry[j][i]);
			}
			System.out.println();
		}
	}
}
