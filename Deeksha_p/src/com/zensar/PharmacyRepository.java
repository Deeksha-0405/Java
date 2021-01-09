package com.zensar;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.zensar.Bean.Admin_Customer;

import com.zensar.utility.DBUtil;

public class PharmacyRepository {
	
public boolean Checkloginadmin(String username, String password) {
		
		Connection con=DBUtil.getMySqlDBConnection();
		String sql="select * from admin where username=?";
		
		try {
			
			PreparedStatement pst=con.prepareStatement(sql);
			pst.setString(1, username);
			ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				String pass=rs.getString("password");
				if(password.equals(pass))
				{
					return true;
				}
				else
				{
					System.out.println("wrong login");
				}
			}
			
		}catch(Exception e) {
			System.out.println("Exception :"+e);
		}
		return false;
		
	}

public boolean Checklogincutomer(String username, String password) {
	
	Connection con=DBUtil.getMySqlDBConnection();
	String sql="select * from customer where username=?";
	
	try {
		
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setString(1, username);
		ResultSet rs=pst.executeQuery();
		while(rs.next())
		{
			String pass=rs.getString("password");
			if(password.equals(pass))
			{
				return true;
			}
			else
			{
				System.out.println("wrong login");
			}
		}
		
	}catch(Exception e) {
		System.out.println("Exception :"+e);
	}
	return false;
	
}



public void addAdmin(Admin_Customer admin) {
	
	Connection con=DBUtil.getMySqlDBConnection();
	String sql="insert into admin values(?, ?, ?, ?, ?, ?, ?)";
			
	try {
		
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,admin.getUser_id());
		pst.setString(2, admin.getUsername() );
		pst.setString(3, admin.getPassword());
		pst.setInt(4, admin.getMobile_number());
		pst.setString(5, admin.getAddress());
		pst.setString(6, admin.getGender());
		pst.setString(7, admin.getState());
		
		int result=pst.executeUpdate();
		if(result==0)
		{
			System.out.println("No Insertion done");
		}
		else {
			System.out.println("Insertion done");
		}
		
	}catch(Exception e) {
		System.out.println("Exception :"+e);
	}
	
}

public void addCustomer(Admin_Customer customer) {
	
	Connection con=DBUtil.getMySqlDBConnection();
	String sql="insert into customer values(?, ?, ?, ?, ?, ?, ?)";
			
	try {
		
		PreparedStatement pst=con.prepareStatement(sql);
		pst.setInt(1,customer.getUser_id());
		pst.setString(2, customer.getUsername() );
		pst.setString(3, customer.getPassword());
		pst.setInt(4, customer.getMobile_number());
		pst.setString(5, customer.getAddress());
		pst.setString(6, customer.getGender());
		pst.setString(7, customer.getState());
		
		int result=pst.executeUpdate();
		if(result==0)
		{
			System.out.println("No Insertion done");
		}
		else {
			System.out.println("Insertion done");
		}
		
	}catch(Exception e) {
		System.out.println("Exception :"+e);
	}
	
}




}
