package com.incarcloud.rooster.util;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

	public static Date date = null;

	public static DateFormat dateFormat = null;

	public static Calendar calendar = null;

	/**
	 * 功能描述：格式化日期
	 * 
	 * @param dateStr  字符型日期
	 * @param format   格式
	 * @return Date 日期
	 */
	public static Date parseDate(String dateStr, String format) {
		try {
			dateFormat = new SimpleDateFormat(format);
			String dt = dateStr.replaceAll("-", "/");
			if ((!dt.equals("")) && (dt.length() < format.length())) {
				dt += format.substring(dt.length()).replaceAll("[YyMmDdHhSs]",
						"0");
			}
			date = (Date) dateFormat.parse(dt);
		} catch (Exception e) {
		}
		return date;
	}

	/**
	 * 功能描述：格式化日期
	 * @param dateStr    字符型日期：YYYY/MM/DD 格式
	 * @return Date 日期
	 */
	public static Date parseDate(String dateStr) {
		return parseDate(dateStr, "yyyy/MM/dd");
	}

	/**
	 * 功能描述：格式化日期
	 * @param dateStr 字符型日期：YYYY-MM-DD 格式
	 * @return Date 日期
	 */
	public static Date parseStrToDate(String dateStr) {
		try {
			dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			date = (Date) dateFormat.parse(dateStr);
		} catch (Exception e) {
			return null;
		}
		return date;
	}

	/**
	 * 功能描述：格式化输出日期
	 * @param date 日期
	 * @param format 格式
	 * @return 返回字符型日期
	 */
	public static String format(Date date, String format) {
		String result = "";
		try {
			if (date != null) {
				dateFormat = new SimpleDateFormat(format);
				result = dateFormat.format(date);
			}
		} catch (Exception e) {
		}
		return result;
	}

	/**
	 * 功能描述：
	 * @param date 日期
	 * @return "yyyy/MM/dd hh:mm格式的时间
	 */
	public static String format(Date date) {
		return format(date, "yyyy/MM/dd hh:mm");
	}

	/**
	 * 功能描述：返回年份
	 * @param date 日期
     * @return 返回年份
	 */
	public static int getYear(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.YEAR);
	}

	/**
	 * 功能描述：返回月份
	 * @param date 日期
	 * @return 返回月份
	 */
	public static int getMonth(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) + 1;
	}

	/**
	 * 功能描述：返回日
	 * @param date 日期
	 * @return 返回日
	 */
	public static int getDay(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * 功能描述：返回小时
	 * @param date 日期
	 * @return 返回小时
	 */
	public static int getHour(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.HOUR_OF_DAY);
	}

	/**
	 * 功能描述：返回分钟
	 * @param date 日期
	 * @return 返回分钟
	 */
	public static int getMinute(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MINUTE);
	}

	/**
	 * 返回秒
	 * @param date 期
	 * @return 返回秒
	 */
	public static int getSecond(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.SECOND);
	}

	/**
	 * 功能描述：返回毫秒
	 * @param date 日期
	 * @return 返回毫秒
	 */
	public static long getMillis(Date date) {
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.getTimeInMillis();
	}

	/**
	 * 功能描述：返回字符型日期
	 * @param date 日期
	 * @return 返回字符型日期 yyyy/MM/dd 格式
	 */
	public static String getDate(Date date) {
		return format(date, "yyyy/MM/dd");
	}

	/**
	 * 功能描述：返回字符型时间
	 * @param date 日期
	 * @return 返回字符型时间 HH:mm:ss 格式
	 */
	public static String getTime(Date date) {
		return format(date, "HH:mm:ss");
	}

	/**
	 * 功能描述：返回字符型日期时间
	 * @param date 日期
	 * @return 返回字符型日期时间 yyyy/MM/dd HH:mm:ss 格式
	 */
	public static String getDateTime(Date date) {
		return format(date, "yyyy/MM/dd HH:mm:ss");
	}

	/**
	 * 功能描述：日期相加
	 * @param date 日期
	 * @param day 天数
	 * @return 返回相加后的日期
	 */
	public static Date addDate(Date date, int day) {
		calendar = Calendar.getInstance();
		long millis = getMillis(date) + ((long) day) * 24 * 3600 * 1000;
		calendar.setTimeInMillis(millis);
		return calendar.getTime();
	}

	/**
	 * 功能描述：日期相减
	 * @param date 日期
	 * @param date1 日期
	 * @return 返回相减后的天数
	 */
	public static int diffDate(Date date, Date date1) {
		return (int) ((getMillis(date) - getMillis(date1)) / (24 * 3600 * 1000));
	}

	/**
	 * 功能描述：取得指定月份的第一天
	 * @param strdate 字符型日期
	 * @return String yyyy-MM-dd 格式
	 */
	public static String getMonthBegin(String strdate) {
		date = parseDate(strdate);
		return format(date, "yyyy-MM") + "-01";
	}

	/**
	 * 功能描述：取得指定月份的最后一天
	 * @param strdate 字符型日期
	 * @return String 日期字符串 yyyy-MM-dd格式
	 */
	public static String getMonthEnd(String strdate) {
		date = parseDate(getMonthBegin(strdate));
		calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, 1);
		calendar.add(Calendar.DAY_OF_YEAR, -1);
		return formatDate(calendar.getTime());
	}

	/**
	 * 功能描述：常用的格式化日期
	 * @param date 日期
	 * @return String 日期字符串 yyyy-MM-dd格式
	 */
	public static String formatDate(Date date) {
		return formatDateByFormat(date, "yyyy-MM-dd");
	}

	/**
	 * 功能描述：常用的格式化日期
	 * @param date 日期
	 * @return String 日期字符串 yyyy-MM-dd HH:mm:ss格式
	 */
	public static String formatDateTime(Date date) {
		return formatDateByFormat(date, "yyyy-MM-dd HH:mm:ss");
	}

	/**
	 * 功能描述：以指定的格式来格式化日期
	 * @param date 日期
	 * @param format String 格式
	 * @return String 日期字符串
	 */
	public static String formatDateByFormat(Date date, String format) {
		String result = "";
		if (date != null) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				result = sdf.format(date);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 两个Calendar相差的天数
	 * @param d1 日期1
	 * @param d2 日期2
	 * @return 相差的天数
	 */
	private static int getDaysBetween(Calendar d1, Calendar d2) {
		if(d1.after(d2)){
			Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		
		int days = d2.get(Calendar.DAY_OF_YEAR) - d1.get(Calendar.DAY_OF_YEAR);
		
		int year = d2.get(Calendar.YEAR);
		
		if(d1.get(Calendar.YEAR) != year){
			d1 = (Calendar)d1.clone();
			
			do{
				days += d1.getActualMaximum(Calendar.DAY_OF_YEAR);
				d1.add(Calendar.YEAR, 1);
			}while(d1.get(Calendar.YEAR) != year);
		}
		
		return days;
		
	}
	
	/**
	 * 获得日期的下一个星期一的日期
	 * @param date 日期
	 * @return Calendar日期
	 */
	private static Calendar getNextMonday(Calendar date){
		Calendar result = date;
		do{
			result = (Calendar)result.clone();
			result.add(Calendar.DATE, 1);
		}while(result.get(Calendar.DAY_OF_WEEK) != 2);
		
		return result;
	}
	
	/**
	 * 计算2个日期之间的工作日天数
	 * @param d1 日期1
	 * @param d2 日期2
	 * @return 日期之间的工作日天数
	 */
	public static int getWorkingDay(Calendar d1,Calendar d2){
		int result = -1;
		
		if(d1.after(d2)){
			Calendar swap = d1;
			d1 = d2;
			d2 = swap;
		}
		
		int betweenDays = getDaysBetween(d1, d2);
		
		int charge_date = 0;
		int charge_start_date = 0;
		int charge_end_date = 0;
		
		int stmp,etmp;		
		stmp = 7 - d1.get(Calendar.DAY_OF_WEEK);
		etmp = 7 - d2.get(Calendar.DAY_OF_WEEK);
		if(stmp != 0 && stmp !=6){
			charge_start_date = stmp - 1;
		}
		if(etmp !=0 && etmp != 6){
			charge_end_date = etmp - 1;
		}
		
		result = (getDaysBetween(getNextMonday(d1),getNextMonday(d2)) / 7) * 5 + charge_start_date - charge_end_date;
		
		return result;
	}
	
	/**
	 * 返回一个日期的中文星期
	 * @param date 日期
	 * @return 中文星期
	 */
	public static String getChineseWeek(Calendar date){
		final String dayNames[] = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五","星期六" };
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		
		return dayNames[dayOfWeek - 1];

	}
	
	/**
	  * 计算两个日期之间的假期
	  * @param d1 日期1
	  * @param d2 日期2
	  * @return 两个日期之间的假期天数
	  */
	 public static int getHolidays(Calendar d1,Calendar d2){
		 return getDaysBetween(d1, d2)-getWorkingDay(d1, d2);
	  
	 }

	public static Date getDate(int year,int month,int day,int hour,int minute,int second) {
		//传入的为我们使用的时间 2012-08-01 12:10:05
		calendar = Calendar.getInstance();
		calendar.set(year,month-1,day,hour,minute,second);
		return calendar.getTime();

	}
}
