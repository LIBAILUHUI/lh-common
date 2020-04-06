package com.lh.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		//判断是否有值
		String str = null;
		System.out.println(StringUtil.hasLength(str));
		System.out.println(StringUtil.hasLength(""));
		//空格
		System.out.println(StringUtil.hasLength(" "));
		System.out.println(StringUtil.hasLength("1"));
	}

	@Test
	public void testHasText() {
		//判断是否有值，空格也算没值
		String str = null;
		System.out.println(StringUtil.hasText(str));
		System.out.println(StringUtil.hasText(""));
		//空格
		System.out.println(StringUtil.hasText(" "));
		System.out.println(StringUtil.hasText("1"));
	}

	//随机产生一个简体中文
	@Test
	public void testRandomChineseOne() {
		System.out.println(StringUtil.randomChineseString());
	}
	
	
	@Test
	public void testRandomChineseString() {
		//随机生成长度为3的简体中文
		System.out.println(StringUtil.randomChineseString(3));
	}

	@Test
	public void testGenerateChineseName() {
		//随机生成百家姓+名字
		System.out.println(StringUtil.generateChineseName());
	}

	
	//验证是否为邮箱
	@Test
	public void testIsEmail() {
		boolean email = StringUtil.isEmail("889@163");
		System.out.println(email);
	}
	
	//验证是否为手机号
	@Test
	public void testIsPhoneNo() {
		boolean phoneNo = StringUtil.isPhoneNo("146678956");
		System.out.println(phoneNo);
	}
	
	//验证是否为数字,包含正数负数小数
	@Test
	public void testIsNumber() {
		boolean number = StringUtil.isNumber("+12.0");
		System.out.println(number);
	}
}
