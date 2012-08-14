package com.comverse.timesheet.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.comverse.timesheet.web.business.TestBusiness;

@Controller
@RequestMapping("/result.do") 
public class ResultController {
	//将spring 配置文件中的bean 通过setter注入进来
	@Resource(name="TestBusiness")
	private TestBusiness testBusiness=null;
	public void setTestBusiness(TestBusiness testBusiness) {
		this.testBusiness = testBusiness;
	}

	@RequestMapping
	public String viewUser(HttpServletRequest request, ModelMap modelMap)
			throws Exception {
		System.out.println("$$$$$$$$$$$$$$$$$$$$$you want to check the result.jsp+++++++++++++");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$ ready to insert   +++++++++++++");
		testBusiness.add();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$ insert completed +++++++++++++");
		return "result";
	}
}
