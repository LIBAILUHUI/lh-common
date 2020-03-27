package com.lh.common.utils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CollectionUtilTest {

	@Test
	public void testHasValue() {
		List list = new ArrayList();
		list.add("1");
		Set set = new HashSet();
		Set set2 = null;
		//空
		System.out.println(CollectionUtil.hasValue(set));
		//空，null
		System.out.println(CollectionUtil.hasValue(set2));
		System.out.println(CollectionUtil.hasValue(list));
	}

}
