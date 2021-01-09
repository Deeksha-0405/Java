package Day8.jdbc;

import java.sql.*;

import beans.Product;
import utility.DBUtil;

public class Example9 {
	
	public static void main(String[] args) {
		
		Product product1=new Product(1, "Desktop", 57000);
		Example9 example9=new Example9();
		example9.addproduct(product1);
		
	}
	
	public void addproduct(Product product)
	{
		
		System.out.println("We are going to add Product : "+product);
		Connection con =DBUtil.getMySqlDBConnection();
		String sql="insert into product values(? ,?, ?)";
		try {
			PreparedStatement pst= con.prepareStatement(sql);
			pst.setInt(1, product.getProductId());
			pst.setString(2, product.getProductName());
			pst.setInt(3, product.getProductPrice());
			int result=pst.executeUpdate();
			if(result==0) {
				System.out.println("Input unsucessfull");
			}
			else {
				System.out.println("Sucess");
			}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
	}

}
