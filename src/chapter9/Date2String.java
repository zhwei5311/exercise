package chapter9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date2String {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// System.out.println(sdf.format(date));
		String string = "2018-02-01 16:25:38";
		Date date2 = sdf.parse(string);
		System.out.println(date2);
	}

}
