package com.isunday.library.index.action;

import java.util.List;


import com.isunday.library.category.service.CategoryService;
import com.isunday.library.category.vo.Category;
import com.isunday.library.product.service.ProductService;
import com.isunday.library.product.vo.Product;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 首页访问的Action
 * @author 传智.郭嘉
 *
 */
public class IndexAction extends ActionSupport{
	// 注入一级分类的Service:
	private CategoryService categoryService;
	// 注入商品的Service
	private ProductService productService;
	
	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	/**
	 * 执行的访问首页的方法:
	 */
	public String execute(){
		// 查询所有一级分类集合
		List<Category> cList = categoryService.findAll();
		// 将一级分类存入到Session的范围:
		ActionContext.getContext().getSession().put("cList", cList);
		// 查询热门商品:
		List<Product> hList = productService.findHot();
		// 保存到值栈中:
		ActionContext.getContext().getValueStack().set("hList", hList);
		// 查询最新商品:
		List<Product> nList = productService.findNew();
		// 保存到值栈中:
		ActionContext.getContext().getValueStack().set("nList", nList);
		return "index";
	}
	
	
}
