/**
 * @author 程森
 *2017年8月21日上午11:31:02
 */
package work;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 作业3  日期
 * @author 程森
 *2017年8月21日上午11:31:02
 */
public class Work3 {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat formater=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String now=formater.format(date);
		System.out.println(now);
		System.out.println(date);
		
		Calendar cal=Calendar.getInstance();
			int year=cal.get(Calendar.YEAR);
			int month=cal.get(Calendar.MONTH)+1;
			int days=cal.get(Calendar.DAY_OF_MONTH);
			int weeks=cal.get(Calendar.DAY_OF_WEEK)-1;
			int hor=cal.get(Calendar.HOUR_OF_DAY);
			int min=cal.get(Calendar.MINUTE);
			int sec=cal.get(Calendar.SECOND);
			System.out.println(year+"/"+month+"/"+days+"\t星期"+weeks+"\t"+hor+":"+min+":"+sec);
			cal.set(2017, 8, 21, 15, 10, 35);
			int years=cal.get(Calendar.YEAR);
			int months=cal.get(Calendar.MONTH)+1;
			int dayss=cal.get(Calendar.DAY_OF_MONTH);
			int weekss=cal.get(Calendar.DAY_OF_WEEK)-1;
			int hors=cal.get(Calendar.HOUR_OF_DAY);
			int mins=cal.get(Calendar.MINUTE);
			int secs=cal.get(Calendar.SECOND);
			System.out.println(years+"/"+months+"/"+dayss+"\t星期"+weekss+"\t"+hors+":"+mins+":"+secs);
	}

}
