package KaoShi.no2;
/**这是一个正方形类*/
public class Square implements Shape{
	/**正方形
	 * @param a 正方形的编程
	 * @return area 正方形的面积
	 * */
	@Override
	public double area(double a) {
		double area=a*a;
		return area;
	}
}
