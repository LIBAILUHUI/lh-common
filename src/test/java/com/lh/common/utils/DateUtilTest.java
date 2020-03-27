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

	
	
	@Test
	public void testRandomDate() {
		Calendar calendar = Calendar.getInstance();
		//起始日期,2010年1月1日
		calendar.set(2010, 0, 1);
		Date date = DateUtil.randomDate(calendar.getTime(), new Date());
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(date));
	
	}
	
	@Test
	public void testGetInitMonth() {
		Date date = DateUtil.getInitMonth(new Date(100000000l));
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}
	
	//月末
	@Test
	public void testGetEndMonth() {
		Calendar date1 = Calendar.getInstance();
		date1.set(2020, 1, 21);
		
		Date date = DateUtil.getEndMonth(date1.getTime());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
	}
	
	@Test
	public void testGetAgeByBirthday() {
		Calendar date1 = Calendar.getInstance();
		date1.set(2010, 2, 27);
		System.out.println(DateUtil.getAgeByBirthday(date1.getTime()));
	}
}
