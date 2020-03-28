package com.lh.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * 
 * @ClassName: RandomUtil 
 * @Description: 随机数处理工具类
 * @author: Administrator
 * @date: 2020年3月26日 上午8:54:23
 */
public class RandomUtil {
	//方法1：返回min-max之间的随机整数（包含min和max值），例如返回1-3之间的随机数，那么返回1或2或3都是正确的，返回4就不对。 (5分)
	public static int random(int min, int max){
		Random r = new Random();
		//int i = r.nextInt(max);//大于等于0小于max
		int i = r.nextInt(max - min +1)+min;
		return i;
	
	}
	//方法2：在最小值min与最大值max之间截取subs个不重复的随机数。例如在1-10之间取3个不重复的随机数，那么[2,6,9]是对的，[3,5,5]则不对，因为5重复了。应用场景：在100篇文章中随机取10篇文章，月考可能会使用到。 (8分)
	public static int[] subRandom (int min, int max, int subs){
		
		if(subs > max-min+1) {
			throw new IllegalArgumentException("输入的数字大于数组长度");
		}
		
		int[] x = new int[subs];
		//存放中间数据，过滤重复数据
		Set<Integer> set = new HashSet<Integer>();
		//如果set集合中的元素个数不等于subs，继续循环
		//用for循环产生的错误:set不能存放重复数据,出现重复数就不会再存储,导致只有subs-1个数据
		while(set.size()!=subs) {
			set.add(random(min, max));
		}
		
		//将产生的随机数放进数组中
		int i = 0;
		for (Integer integer : set) {
			x[i] = integer;
			i++;
		}
	
		return x;
	
	}
	//方法3：返回1个1-9,a-Z之间的随机字符。 (8分)
	public static char randomCharacter (){
		String str = "123456789abcdefghigklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		return str.charAt(random(0, str.length()-1));
	}
	
	//方法3-2：返回指定长度的0-9之间的随机字符。 (8分)
		public static String randomNumber (int length){
			String str = "0123456789"; 
			String result = ""; 
			for (int i = 0; i < length; i++) {
				result += str.charAt(random(0, str.length()-1));
			}
			return result;
		}
	
	
	//方法4：返回参数length个字符串(5分)，方法内部要调用randomCharacter()方法 (4分)
	public static String randomString(int length){
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < length; i++) {
			char ch = randomCharacter();
			//追加
			sBuffer.append(ch);
		}
		return sBuffer.toString();
	}

}
