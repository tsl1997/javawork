package classJob;

public class JiSuanQi {
	/**可变参数传参*/
	public int add(int...nums){
		int sum=0;
		for(int num:nums){
			sum+=num;
		}
		return sum;
	}
}
