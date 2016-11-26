package com.zs.framework.webservice.api;

import java.util.ArrayList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppClient {
	
	
	public static void main(String[] args) {
		
		JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(HelloWorld.class);
        svr.setAddress("http://localhost:8080/helloWorld");
        HelloWorld hw = (HelloWorld) svr.create();
        User user = new User();
        user.setName("Tony");
        user.setDescription("test");
        System.out.println(hw.sayHiToUser(user));
        
	}

}
