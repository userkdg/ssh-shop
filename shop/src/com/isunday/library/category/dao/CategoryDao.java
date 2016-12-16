package com.isunday.library.category.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.isunday.library.category.vo.Category;


/**
 * 一级分类的持久层对象
 * @author 传智.郭嘉
 *
 */
public class CategoryDao extends HibernateDaoSupport{

	//DAO层的查询所有一级分类的方法
	public List<Category> findAll() {
		String hql = "from Category";
		List<Category> list = this.getHibernateTemplate().find(hql);
		return list;
	}
	
}
