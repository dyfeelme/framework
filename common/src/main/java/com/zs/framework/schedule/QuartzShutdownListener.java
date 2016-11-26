package com.zs.framework.schedule;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.web.context.WebApplicationContext;

/**
 * Web关闭时通知Quartz，调用关闭
 * @author Feelme
 */
public class QuartzShutdownListener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent event) {
		
		WebApplicationContext webApplicationContext = (WebApplicationContext) event
                .getServletContext()
                .getAttribute(
                        WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
        org.quartz.impl.StdScheduler startQuertz = (org.quartz.impl.StdScheduler) webApplicationContext
                .getBean("schedulerFactoryBean");
        if(startQuertz != null) {
            startQuertz.shutdown();
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	}

	public void contextInitialized(ServletContextEvent event) {
		
	}


}
