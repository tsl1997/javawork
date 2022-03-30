package KaoShi.no2;

import static java.lang.Math.PI;

public class Circle implements Shape{
	/**圆的面积
	 * @param a 半径
	 * @return area 面积*/
	@Override
	public double area(double a) {
		double area =PI*a*a;//原的面积计算
		return area;
	}
}
