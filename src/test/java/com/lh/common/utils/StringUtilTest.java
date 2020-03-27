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

}
