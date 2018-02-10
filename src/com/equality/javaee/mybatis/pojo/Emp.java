/**
 * 
 */
package com.equality.javaee.mybatis.pojo;

/**
 * @author asus
 *
 */
public class Emp {
	
	/**
	 * 
	 */
	public Emp() {}
	
	public Emp(Integer id, String name, Double sal, String sex) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.sex = sex;
	}

	private Integer id;//编号
	private String name;//姓名
	private Double sal;//薪水
	private String sex;//性别
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the sal
	 */
	public Double getSal() {
		return sal;
	}
	/**
	 * @param sal the sal to set
	 */
	public void setSal(Double sal) {
		this.sal = sal;
	}
	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

}
