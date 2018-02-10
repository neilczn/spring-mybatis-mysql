package com.equality.javaee.mybatis.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.equality.javaee.mybatis.pojo.Emp;
import com.equality.javaee.mybatis.service.EmpService;

@Controller
@RequestMapping(value="/user")
public class UserAction {

	public UserAction() {
	}
	
	private EmpService empService;
	@Resource(name="empServiceID")
	public void setEmpService(EmpService empService) {
		this.empService = empService;
	}
	
	@RequestMapping(value="/add")
	public String add(Emp emp) throws Exception{
		empService.register(emp);
		return "success";
	}

}
