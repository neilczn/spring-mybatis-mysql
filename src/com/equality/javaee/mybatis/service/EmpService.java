package com.equality.javaee.mybatis.service;

import com.equality.javaee.mybatis.dao.EmpDao;
import com.equality.javaee.mybatis.pojo.Emp;

/**
 * 业务层
 * 实现类
 * @author asus
 */
public class EmpService {
	
	EmpDao empDao;
	public void setEmpDao(EmpDao empDao) {
		this.empDao = empDao;
	}

	public EmpService() {
	}
	
	/**
	 * 注册员工
	 */
	public void register(Emp emp) throws Exception{
		empDao.add2(emp);
	}

}
