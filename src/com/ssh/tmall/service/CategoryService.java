package com.ssh.tmall.service;

import java.util.List;

import com.ssh.tmall.model.Category;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��6��29�� ����2:20:31
* @version 1.0
*/

public interface CategoryService {
	
	/**
	 * ��ѯ������Ʒ���
	 * @return List<Category>
	 */
	List<Category> list();
	
	/**
	 * �־û�һ����Ʒ���
	 * @param category
	 */
	void save(Category category);

	
}
