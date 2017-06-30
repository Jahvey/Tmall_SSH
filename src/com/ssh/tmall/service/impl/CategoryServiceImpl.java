package com.ssh.tmall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssh.tmall.dao.impl.CategoryDAOImpl;
import com.ssh.tmall.model.Category;
import com.ssh.tmall.service.CategoryService;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��6��29�� ����2:22:04
* @version 1.0
*/
@Component
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryDAOImpl categoryDAOImpl;
	
	public CategoryDAOImpl getCategoryDAOImpl() {
		return categoryDAOImpl;
	}
	public void setCategoryDAOImpl(CategoryDAOImpl categoryDAOImpl) {
		this.categoryDAOImpl = categoryDAOImpl;
	}

	
	/**
	 * ��ѯ������Ʒ���
	 * @return List<Category>
	 */
	@Override
	public List<Category> list() {

		return this.categoryDAOImpl.list();
	}
	@Override
	public void save(Category category) {
		// TODO Auto-generated method stub
		this.categoryDAOImpl.save(category);
	}
	

}
