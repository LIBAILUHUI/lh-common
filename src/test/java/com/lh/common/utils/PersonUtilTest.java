package com.lh.common.utils;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.lh.domain.Person;

public class PersonUtilTest {

	@Test
	public void testGenerateObject() {
		Person person = PersonUtil.generateObject();
		System.out.println(person);
	}

	@Test
	public void testGenerateObjectList() {
		List<Person> list = PersonUtil.generateObjectList(10000);
		for (Person person : list) {
			System.out.println(person);
		}
	}

}
