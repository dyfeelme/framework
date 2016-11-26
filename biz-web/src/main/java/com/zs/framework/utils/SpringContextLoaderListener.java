package com.zs.framework.utils;

import javax.servlet.ServletContextEvent;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SpringContextLoaderListener extends ContextLoaderListener{
	
	@Override
	public void contextInitialized(ServletContextEvent event) {
		super.contextInitialized(event);
		
		new ApplicationFactory()
		.setApplicationContext(WebApplicationContextUtils.getWebApplicationContext(event.getServletContext()));
	}

}
