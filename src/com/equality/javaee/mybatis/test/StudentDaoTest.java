package com.equality.javaee.mybatis.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.equality.javaee.mybatis.dao.EmpDao;
import com.equality.javaee.mybatis.dao.StudentDao;
import com.equality.javaee.mybatis.pojo.Student;

public class StudentDaoTest {

	private ApplicationContext ac;
	private StudentDao studentDao;
	
	@Before
	public void setUp() throws Exception {
		ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		studentDao = (StudentDao) ac.getBean("studentDaoID");
	}

	@Test
	public void testAdd() throws Exception {
		//fail("Not yet implemented");
		studentDao.add(new Student(4,"haha",90D));
	}

	@Test
	public void testFindById() throws Exception {
		//fail("Not yet implemented");studentDaoID
		//ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"spring.xml"});
		//StudentDao studentDao = (StudentDao) ac.getBean("studentDaoID");
		Student s = studentDao.findById(1);
		System.out.println(s);
	}

	@Test
	public void testFindAll() throws Exception {
		//fail("Not yet implemented");
		List<Student> s = studentDao.findAll();
		for (Student student : s) {
			System.out.println(student);
		}
		
	}
	

	@Test
	public void testUpdate() throws Exception {
		//fail("Not yet implemented");
		Student s = studentDao.findById(4);
		System.out.println(s);
		s.setName("heihei");
		studentDao.update(s);
		System.out.println(s);
	}

	@Test
	public void testDelete() throws Exception {
		//fail("Not yet implemented");
		Student s = studentDao.findById(4);
		studentDao.delete(s);
	}

}
