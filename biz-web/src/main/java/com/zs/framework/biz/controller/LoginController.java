package com.zs.framework.biz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zs.framework.biz.model.Corp;

@Controller
public class LoginController {
	
	@RequestMapping
	public Object login(){
		Corp corp = new Corp();
		corp.setOperatorId(1);
		corp.setCorpName("test");
		corp.setCorpNo(110);
		return corp;
	}

}
