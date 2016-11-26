package com.zs.framework.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationFactory implements ApplicationContextAware{
	
	private static ApplicationContext applicationContext = null;

	public static ApplicationContext getApplicationContext() {
		
		if(applicationContext == null){
			applicationContext = new ClassPathXmlApplicationContext(
					new String[]{"classpath:applicationContext.xml"
							,"classpath*:applicationContext-*.xml"
							,"classpath:beans/*.xml"
							,"classpath*:beans/*.xml"
					});
		}
		return applicationContext;
	}

	public void setApplicationContext(ApplicationContext context) throws BeansException {
		
		applicationContext = context;
	}
	
	
	
	
	
	
	

}
