package com.equality.javaee.mybatis.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.equality.javaee.mybatis.dao.EmpDao;
import com.equality.javaee.mybatis.pojo.Emp;

public class EmpDaoTest {

	private ApplicationContext ac;
	private EmpDao empDao;
	
	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		empDao = (EmpDao) ac.getBean("empDaoID");
	}

	@Test
	public void testFindById() throws Exception {
		//fail("Not yet implemented");
		Emp emp = empDao.findById(3);
		System.out.println(emp);
	}
	
	@Test
	public void testAdd() throws Exception {
		//fail("Not yet implemented");
		Emp emp = new Emp(5, "xixi", 800D, "ma");
		empDao.add(emp);
		
	}
	
	@Test
	public void testUpdate() throws Exception {
		//fail("Not yet implemented");
		Emp emp = empDao.findById(5);
		emp.setName("123");
		empDao.update(emp);
		
	}
	
	@Test
	public void testDelete() throws Exception {
		//fail("Not yet implemented");
		Emp emp = new Emp(5, "xixi", 800D, "ma");
		empDao.delete(emp);
		
	}

}
