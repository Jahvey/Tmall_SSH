package com.ssh.tmall.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssh.tmall.dao.CategoryDAO;
import com.ssh.tmall.model.Category;

/**
 * Category�ӿڵ�ʵ����
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��6��29�� ����2:12:35
* @version 1.0
*/

@Component
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory SessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		SessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return SessionFactory;
	}
	
	public Session getSession(){
		return this.SessionFactory.getCurrentSession();
	}
	
	/**
	 * ��ѯ������Ʒ���
	 * @return List<Category>
	 */
	@Override
	public List<Category> list() {
		String hql="from Category";		
		return this.getSession().createQuery(hql).list();
	}
	
	
	@Override
	public void save(Category category) {
//		System.out.println(this.SessionFactory);
		this.getSession().save(category);
		
	}

}
