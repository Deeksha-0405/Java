package day9.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import beans.Product;
import utility.DBUtil;

public class ProductDao {
	
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

	public void viewproduct() {
		Connection con =DBUtil.getMySqlDBConnection();
		String sql="select * from product";
		try {
			
			PreparedStatement pst= con.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				int pro_id=rs.getInt("product_id");
				String pro_name=rs.getString("product_name");
				int price=rs.getInt("price");
				System.out.println("Product ID :"+pro_id+"\nProduct Name :"+pro_name+"\nPrice :"+price);
				System.out.println("++++++++++++++++++++++++++");
				
			}
			
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
	}
	
	public void getProduct(int pro) {

		Connection con =DBUtil.getMySqlDBConnection();
		String sql = "select * from product where product_id=?";
		
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, pro);
			ResultSet rs=pst.executeQuery();
			if(rs.next())
			{
				rs.getInt(1);
				int pro_id=rs.getInt("product_id");
				String pro_name=rs.getString("product_name");
				int price=rs.getInt("price");
				
				if(pro==pro_id){
					System.out.println("Id found");
					System.out.println("Product ID :"+pro_id+"\nProduct Name :"+pro_name+"\nPrice :"+price);
				}
			}else
			{
				System.out.println("ID not found");
			}
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		
		}
	
	public void deleteproduct(int productId) {
		Connection con = DBUtil.getMySqlDBConnection();
		String sql = "delete from product where product_id=?";
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(1, productId);
			int result=pst.executeUpdate();
			if(result==0)
			{
				System.out.println("Update not done : The ProductId doesnot exist");
			}
			else
			{
				System.out.println("Update done");
			}
			
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		
	}
	
	public void Updateproduct(Product product)
	{
		Connection con = DBUtil.getMySqlDBConnection();
		String sql = "update product set product_name=?, price=? where product_id=?";
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setInt(3, product.getProductId());
			pst.setString(1, product.getProductName());
			pst.setInt(2, product.getProductPrice());
			int result =pst.executeUpdate();
			if(result==0)
			{
				System.out.println("No Update done");
			}
			else {
				System.out.println("update done");
			}
			
	}catch(Exception e) {
		System.out.println("Exception :"+e);
	}
	
   }

}
