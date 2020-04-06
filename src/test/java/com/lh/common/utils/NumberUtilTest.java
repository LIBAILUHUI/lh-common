package com.lh.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testGetPercent() {
		System.out.println(NumberUtil.getPercent(51, 68));
		System.out.println(NumberUtil.getPercent(20, 100));
		System.out.println(NumberUtil.getPercent(1, 3));
	}

}
