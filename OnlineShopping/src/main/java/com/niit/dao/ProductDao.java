package com.niit.dao;



import java.util.List;

import com.niit.model.Category;
import com.niit.model.Product;


public interface ProductDao 
{
  
	Product saveProduct(Product product);//product.id=0,new object,insert
	Product getProduct(int id);
	 //updated product details
	void updateProduct(Product product);//product.id= ,already existing obj,update
	void deleteProduct(int id);
	List<Product> getAllProducts();//fetch all the records from product table
	
	List<Category> getAllCategories();
	}	



