package com.lh.common.utils;

/**
 * 
 * @ClassName: NumberUtil 
 * @Description:数字工具处理类
 * @author: Administrator
 * @date: 2020年4月5日 下午3:15:28
 */
public class NumberUtil {

	/*
	* 百分比计算方法，返回值只要整数不需要小数。
	* 给一个当前数，和一个总数，计算当前数百分占比，例如参数为5和10，方法内部
	* 5除以10得0.5，再乘以100，返回50，注意四舍五入。页面就可以显示50%
	*/
	public static int getPercent(int current, int total){
		
		double j = (double)current/(double)total*100;
		long round = Math.round(j);
		int num = new Long(round).intValue();
		return num;
	}

	
	/*
	 * public static void main(String[] args) { System.out.println(getPercent(7,
	 * 8));
	 * 
	 * System.out.println(getPercent(999999999, 1999999999)); }
	 */
	

}
