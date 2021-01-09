package day9.jdbc;

import java.sql.*;

import beans.Product;
import utility.DBUtil;

public class Example1 {
	
	public static void main(String[] args) {
		
	//	Product product1=new Product(2, "Mobile", 17000);
		ProductDao productDao =new ProductDao();
	//	Example1 example9=new Example1();
	//	example9.addproduct(product1);
	//	example9.viewproduct();
	//	productDao.getProduct(2);
	//	productDao.deleteproduct(4);
		Product product1=new Product(2, "Dell", 25000);
		productDao.Updateproduct(product1);
		
	}
	
		
}
