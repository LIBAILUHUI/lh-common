package com.lh.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public static String generateDate() {
		//随机产生年
		int year = RandomUtil.random(1970, 2020);
		//随机产生月
		int month = RandomUtil.random(1, 12);
		//随机产生日期
		int day = RandomUtil.random(1, 31);
		
		String date = year+"-"+month+"-"+day;
		
		return date;
	}
	
	
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 随机产生一个在startDate和endDate的随机日期
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate) {
		//从1970年到startDate的毫秒数
		long endTime = endDate.getTime();
		long startTime = startDate.getTime();
		if(endTime<startTime) {
			throw new IllegalArgumentException("开始日期不能大于结束日期");
		}
		
		//随机产生一个在t1和t2之间的毫秒数
		long t = (long) ((Math.random() * (endTime-startTime+1)) +startTime);
		return new Date(t);
	}
}
