package com.equality.javaee.mybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.equality.javaee.mybatis.pojo.Student;



/**
 * 持久层
 * @author asus
 *
 */
public class StudentDao {

	private SqlSessionFactory sqlSessionFactory;
	

	/**
	 * @param sqlSessionFactory the sqlSessionFactory to set
	 */
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	
	public StudentDao() {
	}
	
	
	/**
	 * 增加学生
	 */
	public void add(Student student) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert(Student.class.getName()+".add", student);
		sqlSession.close();
	}
	
	/**
	 * 根据ID查询学生 
	 */
	public Student findById(Integer id) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		//Student s = sqlSession.selectOne("com.equality.javaee.mybatis.entity.Student.findById", id);
		String temp = Student.class.getName();
		Student s = sqlSession.selectOne(temp+".findById", id);
		
		sqlSession.close();
		return s;
	}
	
	/**
	 * 查询学生 
	 */
	public List<Student> findAll() throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<Student> s = sqlSession.selectList(Student.class.getName()+".findAll");
		sqlSession.close();
		return s;
	}
	
	/**
	 * 更新学生 
	 */
	public void update(Student student) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int i = sqlSession.update(Student.class.getName()+".update", student);
		System.out.println(i);
		sqlSession.close();
	}
	
	/**
	 * 删除学生 
	 */
	public void delete(Student student) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int i = sqlSession.update(Student.class.getName()+".delete", student);
		System.out.println(i);
		sqlSession.close();
	}
	

}
