/**
 * ����Spring4.0��Դ���ʻ�
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
		 
         //ʵ����ApplicationContext
		ApplicationContext act = new ClassPathXmlApplicationContext("appicationContext.xml");
	    // ����������
		String [] a ={"reader"};
		// ʹ��getMessage ������ȡ���ػ���Ϣ��Locale��getDefault����
		// ���ؼ����������Ĭ��Locale
		String hello = act.getMessage("hello", a, Locale.getDefault());
		Object[] b = {new Date()};
		String now = act.getMessage("now", b, Locale.getDefault());
		
		// ��ӡ���������ػ���Ϣ
		System.out.println(hello+"_"+now);
	}

}
