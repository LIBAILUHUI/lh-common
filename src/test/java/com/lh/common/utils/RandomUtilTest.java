package com.lh.common.utils;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		//随机生成1-120之间的数
		int i = RandomUtil.random(1, 120);
		System.out.println(i);
	}

	@Test
	public void testSubRandom() {
		//随机生成1-10之间的3个数
		int[] i = RandomUtil.subRandom(1, 10, 3);
		for (int j : i) {
			System.out.println(j);
		}
	}

	@Test
	public void testRandomCharacter() {
		//随机生成1-9，a-Z之间的字符
		System.out.println(RandomUtil.randomCharacter());
	}

	@Test
	public void testRandomString() {
		//随机生成长度为3的字符串
		String randomString = RandomUtil.randomString(3);
		System.out.println(randomString);
	}
	
	
	@Test
	public void testRandomCharacterByLength() {
		
		System.out.println(RandomUtil.randomCharacterByLength(10));
	}
	

}
