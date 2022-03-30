package homeWork.no2;

public class Demo {
	/**该程序有异常，请调试人员自行处理*/
	public int div(int a,int b)throws RuntimeException{
		if (b==0){
			throw new RuntimeException("除数不能是0");
		}
		int c=a/b;
		return c;
	}
}
