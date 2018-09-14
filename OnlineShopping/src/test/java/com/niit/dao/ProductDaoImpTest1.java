package com.niit.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfig;
import com.niit.model.Product;



public class ProductDaoImpTest1 {
	ApplicationContext context= new AnnotationConfigApplicationContext(DBConfig.class,ProductDaoImpTest1.class);
	ProductDao productDao=(ProductDao)context.getBean("productDaoImp");

    /* 
	@Test
	public void testGetProduct() {
		Product product1=productDao.getProduct(1);

		//assertNotNull(product1);
		//check for prices[actual price returned is same as expected price is id=3
		double expectedprice=100.0;
		double actualprice=product1.getPrice();
		assertTrue(expectedprice == actualprice);
		}
	
	@Test
	public void testGetAllProduct()
	{
		List<Product> products=productDao.getAllProducts();
	assertTrue(products.size()>0);
	assertFalse(products.isEmpty());
		}

	/*
	@Test
	public void testUpdateProduct() {
		Product product=productDao.getProduct(4);
		product.setPrice(500);
		product.setQuantity(5);
		productDao.updateProduct(product);
		
		assertTrue(product.getPrice()==500);
		//assertTrue(product.getQuantity()==25);
	}
	*/
}
