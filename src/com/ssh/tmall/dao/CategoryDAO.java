package com.ssh.tmall.dao;

import java.util.List;

import com.ssh.tmall.model.Category;

/**
 * Categoty��DAO�ӿ�
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��6��29�� ����2:04:14
* @version 1.0
*/

public interface CategoryDAO {
	
	/**
	 * ��ѯ������Ʒ���
	 * @return List<Category>
	 */
	List<Category> list();
	
	
	/**
	 * �־û�һ������
	 * @param category
	 */
	void save(Category category);

}
