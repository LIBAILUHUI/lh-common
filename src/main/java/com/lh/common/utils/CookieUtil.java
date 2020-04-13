package com.lh.common.utils;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CookieUtil {

	/**
	 * 
	 * @Title: getCookie 
	 * @Description: 获取cookie
	 * @param request
	 * @param cookieName
	 * @return
	 * @return: Cookie
	 */
	public static Cookie getCookie(HttpServletRequest request,String cookieName) {
		Cookie cookie = null;
		//获取所有的cookie对象
		Cookie[] cookies = request.getCookies();
		
		if(null!=cookies) {
			for (Cookie ck : cookies) {
				String name = ck.getName();
				if(cookieName.equals(name)) {
					cookie = ck;
					break;
				}
			}
		}
		
		if(null == cookie) {
			cookie = new Cookie(cookieName, null);
	}
		return cookie;
	}
	
	/**
	 * 
	 * @Title: isCheck 
	 * @Description: 检查是否存在该cookie
	 * @param cookie
	 * @param newValue
	 * @param response
	 * @return
	 * @return: boolean
	 */
	public static boolean isCheck(Cookie cookie,String newValue,HttpServletResponse response) {
		if(cookie.getValue()!=null) {
			String[] split = cookie.getValue().split("-");
			if(split!=null && split.length>0) {
				List<String> asList = Arrays.asList(split);
				if(asList.contains(newValue)) {
					System.out.println("已经有了");
					return false;
				}else {
					//设置新的cookie值
					cookie.setValue(newValue);
					response.addCookie(cookie);
					System.out.println("没有");
					return true;
				}
			
			}
		}else {
			//设置新的cookie值
			cookie.setValue(newValue);
			//回写到浏览器
			response.addCookie(cookie);
		}
		return true;
	}
}
