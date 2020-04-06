package com.lh.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testGenerateDate() {
		String date = DateUtil.generateDate();
		System.out.println(date);
	}

	
	//返回某个日期范围的随机日期
	@Test
	public void testRandomDate() {
		Calendar calendar = Calendar.getInstance();
		//起始日期,2010年1月1日
		calendar.set(2010, 0, 1);
		Date date = DateUtil.randomDate(calendar.getTime(), new Date());
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(date));
	
	}
	
	//返回传入日期的月初
	@Test
	public void testGetInitMonth() {
		Date date = DateUtil.getInitMonth(new Date(1000000000000l));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}
	
	////返回传入日期的月末
	@Test
	public void testGetEndMonth() {
		Calendar date1 = Calendar.getInstance();
		date1.set(2020, 3, 21);
		
		Date date = DateUtil.getEndMonth(date1.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}
	
	//根据出生日期计算年龄
	@Test
	public void testGetAgeByBirthday() {
		Calendar date1 = Calendar.getInstance();
		date1.set(2019, 2, 28);
		System.out.println(DateUtil.getAgeByBirthday(date1.getTime()));
	}
	
	//是否是今天
	@Test
	public void testIsToday() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2020, 2, 29);
		System.out.println(DateUtil.isToday(calendar.getTime()));
	}
	
}
