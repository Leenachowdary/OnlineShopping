package com.niit.OnlineShopping;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.configuration.DBConfig;
import com.niit.dao.ProductDao;
import com.niit.model.Product;


public class App
{
    public static void main( String[] args )
    {
        System.out.println("Hello World");
 
    	ApplicationContext context= new AnnotationConfigApplicationContext(DBConfig.class,ProductDao.class);
 
    	ProductDao productDao=(ProductDao)context.getBean("productDaoImp");
    	
    //	Product product=new Product();
    	
    /*	product.setProductName("sony001");
    	product.setProductDesc("Description about sony");
    	product.setPrice(18000);
    	product.setQuantity(20);
    	productDao.saveProduct(product);
    	productDao.deleteProduct(2);
    	*/
    	List<Product> products=productDao.getAllProducts();
    	
    	for(Product p:products)
    	
System.out.println(p.getId()+" "+p.getProductdesc()+" "+p.getProductdesc()+" "+p.getPrice()+" "+p.getQuantity());    	
    	}
    }


