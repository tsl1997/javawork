package kaoShi.no3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	/**字符串转Date类型
	 * @param string 格式为：”yyyy-MM-dd“*/
	public Date stringToDate(String string)throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.parse(string);
	}
	/**Dat转换字符串*/
	public String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(date);
	}

}
