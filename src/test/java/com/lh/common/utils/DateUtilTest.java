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
		calendar.set(2010, 0, 1);
		Date date = DateUtil.randomDate(calendar.getTime(), new Date());
	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println(sdf.format(date));
	
	}
}
