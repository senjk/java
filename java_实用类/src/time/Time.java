/**
 * @author 程森
 *2017年8月21日上午11:19:34
 */
package time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 程森
 *2017年8月21日上午11:19:34
 */
public class Time {


	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now=formater.format(date);
		System.out.println(now);
		System.out.println(date);

	}

}
