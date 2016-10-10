/**
 * 测试Spring4.0资源国际化
 */
package com.telek.i18n;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 *
 */
public class GetMessage {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
		 
         //实例化ApplicationContext
		ApplicationContext act = new ClassPathXmlApplicationContext("appicationContext.xml");
	    // 创建参数组
		String [] a ={"reader"};
		// 使用getMessage 方法获取本地化消息。Locale的getDefault方法
		// 返回计算机环境的默认Locale
		String hello = act.getMessage("hello", a, Locale.getDefault());
		Object[] b = {new Date()};
		String now = act.getMessage("now", b, Locale.getDefault());
		
		// 打印出两条本地化消息
		System.out.println(hello+"_"+now);
	}

}
