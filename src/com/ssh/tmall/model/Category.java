package com.ssh.tmall.model;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��6��29�� ����12:03:13
* @version 1.0
*/


/**
 * ����ʵ����Category��������Ʒ�����
 * ��Ӧ���ݿ��е�category��
 * @version 1.0
 * @author zhuxindong	
 */
public class Category {
	
	/**
	 * ����
	 */
	private int id; 
	/**
	 * ��Ʒ��������
	 */
	private String name;	
	
	/**
	 * getter��setter����
	 */
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
