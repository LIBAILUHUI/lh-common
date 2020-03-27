package com.lh.common.utils;

import java.util.Collection;
import java.util.List;

public class CollectionUtil {
	
	/**
	 * 
	 * @Title: hasValue 
	 * @Description: 判断集合是否有值
	 * @param list
	 * @return
	 * @return: boolean
	 */
	//想想传什么值比较合适
	public static boolean hasValue(Collection<?> collection) {
		
		return collection!=null && collection.size()>0;
		
	}
	
	
}
