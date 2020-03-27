package com.lh.common.utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.lh.domain.Person;

public class PersonUtil {

	public static Person generateObject() {
		Person person = new Person();
		person.setName(StringUtil.generateChineseName());
		person.setAge(RandomUtil.random(1, 120));
		//这个有乱码的话。就去工具类里把区位码改小一点，避免边缘可能出错的东西
		person.setAbout(StringUtil.randomChineseString(140));
		//person.setCreated(DateUtil.generateDate());
		Calendar calendar = Calendar.getInstance();
		calendar.set(2010, 0, 1);
		
		DateUtil.randomDate(calendar.getTime(), new Date());
		person.setCreated(DateUtil.randomDate(calendar.getTime(), new Date()));
		return person;
	}
	
	
	public static List<Person> generateObjectList(int size){
		List<Person> list = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			Person person = generateObject();
			list.add(person);
		}
		return list;
		
	}
}
