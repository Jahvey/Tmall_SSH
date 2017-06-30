package com.ssh.tmall.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssh.tmall.dao.impl.CategoryDAOImpl;
import com.ssh.tmall.model.Category;
import com.ssh.tmall.service.impl.CategoryServiceImpl;

/**
* @author zhuxindong  E-mail:501801307@qq.com
* @date ����ʱ�䣺2017��6��29�� ����7:05:54
* @version 1.0
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTmall {

	@Autowired
	private CategoryServiceImpl categoryServiceImpl;
	
	public CategoryServiceImpl getCategoryServiceImpl() {
		return categoryServiceImpl;
	}
	public void setCategoryServiceImpl(CategoryServiceImpl categoryServiceImpl) {
		this.categoryServiceImpl = categoryServiceImpl;
	}
	
	
	@Test
	public void test(){
		
		
		
		Category category1=new Category();
		Category category2=new Category();
		
		category1.setName("���Է���1");
		category2.setName("���Է���2");
//		System.out.println(category1);
//		System.out.println(categoryDAOImpl);
		
		categoryServiceImpl.save(category1);
		categoryServiceImpl.save(category2);
		System.out.println("��Ӳ��Է���ɹ�");
	}
	
	
}
