/**
 * 
 */
package com.equality.javaee.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.equality.javaee.mybatis.pojo.Emp;
import com.equality.javaee.mybatis.pojo.Student;
import com.equality.javaee.mybatis.util.MybatisUtil;

/**
 * @author asus
 *
 */
public class EmpDao {
	
	private SqlSessionFactory sqlSessionFactory;
	

	/**
	 * @param sqlSessionFactory the sqlSessionFactory to set
	 */
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	/**
	 * 
	 */
	public EmpDao() {
	}

	/**
	 * 增加员工--单独测试mybatis
	 * @param emp
	 */
	public void add1(Emp emp) {
		SqlSession sqlSession=null;
		try {
			sqlSession=MybatisUtil.getSqlSession();
			sqlSession.insert(Emp.class.getName()+".add", emp);
			sqlSession.commit();			
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}
		finally {
			MybatisUtil.closeSqlSession();
		}
	}

	/**
	 * 增加员工
	 * @param emp
	 */
	public void add2(Emp emp) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.insert(Emp.class.getName()+".add", emp);
		//int i=1/0;//测试事务
		sqlSession.close();
	}
	
	
	public Emp findByPrimaryKey(int id){
		SqlSession sqlSession=sqlSessionFactory.openSession();
		Emp emp = sqlSession.selectOne(Emp.class.getName()+".findByPrimaryKey", id);
		sqlSession.close();
		return emp;
	}
	
	/**
	 * 增加员工
	 * @param emp
	 */
	public void add(Emp emp) {
		SqlSession sqlSession=sqlSessionFactory.openSession();
		sqlSession.insert(Emp.class.getName()+".add", emp);
		//int i=1/0;//测试事务
		sqlSession.close();
	}
	
	public Emp findById(Integer id){
		SqlSession sqlSession=sqlSessionFactory.openSession();
		String temp = Emp.class.getName();
		Emp emp = sqlSession.selectOne(temp+".findById", id);
		sqlSession.close();
		return emp;
	}
	
	/**
	 * 
	 */
	public void update(Emp emp) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int i = sqlSession.update(Emp.class.getName()+".update", emp);
		System.out.println(i);
		sqlSession.close();
	}
	
	/**
	 * 
	 */
	public void delete(Emp emp) throws Exception{
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int i = sqlSession.update(Emp.class.getName()+".delete", emp);
		System.out.println(i);
		sqlSession.close();
	}

}
