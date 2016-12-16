package com.isunday.library.category.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.isunday.library.category.dao.CategoryDao;
import com.isunday.library.category.vo.Category;


/**
 * 一级分类的业务层对象
 * @author 传智.郭嘉
 *
 */
@Transactional
public class CategoryService {
	// 注入CategoryDao
	private CategoryDao categoryDao;

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	// 业务层查询所有一级分类的方法
	public List<Category> findAll() {
		return categoryDao.findAll();
	}
	
}
