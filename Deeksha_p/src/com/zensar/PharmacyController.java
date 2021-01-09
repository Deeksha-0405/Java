package com.zensar;


import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zensar.Bean.Admin_Customer;


public class PharmacyController extends HttpServlet{
	
public void doGet(HttpServletRequest request, HttpServletResponse response) {
		
		String RequestAction=request.getParameter("requestAction");
		
		if(RequestAction.equalsIgnoreCase("Adminlogin"))
		{
			String username=request.getParameter("username");
			String password=request.getParameter("password");

			
			PharmacyRepository pharmacypository= new PharmacyRepository();
			boolean login=pharmacypository.Checkloginadmin(username, password);
			if(login)
			{
				RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
				try {
					
					request.setAttribute("username", username);					
					rd.forward(request, response);		
					
				}catch(Exception e) {
					System.out.println("Exception :"+e);
				}
			}
			else {		
								
				
				RequestDispatcher rd=request.getRequestDispatcher("AdminLogin.jsp");
				try {
					request.setAttribute("LoginStatus", "fail");
					rd.forward(request, response);	
					System.out.println("Login failed");
					
				}catch(Exception e)
				{
					System.out.println("Exception :"+e);
				}
			}
		}
		
		
		else if(RequestAction.equalsIgnoreCase("CustomerLogin"))
		{
			String username=request.getParameter("username");
			String password=request.getParameter("password");

			
			PharmacyRepository pharmacypository= new PharmacyRepository();
			boolean login=pharmacypository.Checklogincutomer(username, password);
			if(login)
			{
				RequestDispatcher rd=request.getRequestDispatcher("OrderPage.jsp");
				try {
					
					request.setAttribute("username", username);					
					rd.forward(request, response);		
					
				}catch(Exception e) {
					System.out.println("Exception :"+e);
				}
			}
			else {		
								
				
				RequestDispatcher rd=request.getRequestDispatcher("CustomerLogin.jsp");
				try {
					request.setAttribute("LoginStatus", "fail");
					rd.forward(request, response);	
					System.out.println("Login failed");
					
				}catch(Exception e)
				{
					System.out.println("Exception :"+e);
				}
			}
		}
		
		else if(RequestAction.equalsIgnoreCase("addAdmin"))
		{
		  
			int user_id=Integer.parseInt(request.getParameter("user_id"));
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			int mobile_number=Integer.parseInt(request.getParameter("mobile_number"));
			String address=request.getParameter("address");
			String gender=request.getParameter("gender");
			String state=request.getParameter("state");
			
		
				PharmacyRepository pharmacyRepository = new PharmacyRepository();
				Admin_Customer admin= new Admin_Customer(user_id, username, password, mobile_number, address, gender, state);
				pharmacyRepository.addAdmin(admin);
				

				try {

					response.sendRedirect("AdminLogin.jsp");
					
				}catch(Exception e)
				{
					System.out.println("Exception :"+e);
				}
		
		
		}
		else if(RequestAction.equalsIgnoreCase("addCustomer"))
		{
		  
			int user_id=Integer.parseInt(request.getParameter("user_id"));
			String username=request.getParameter("username");
			String password=request.getParameter("password");
			int mobile_number=Integer.parseInt(request.getParameter("mobile_number"));
			String address=request.getParameter("address");
			String gender=request.getParameter("gender");
			String state=request.getParameter("state");
			
		
				PharmacyRepository pharmacyRepository = new PharmacyRepository();
				Admin_Customer customer= new Admin_Customer(user_id, username, password, mobile_number, address, gender, state);
				pharmacyRepository.addCustomer(customer);
				

				try {

					response.sendRedirect("CustomerLogin.jsp");
					
				}catch(Exception e)
				{
					System.out.println("Exception :"+e);
				}
		
		
		}
		
		
}

public void doPost(HttpServletRequest request, HttpServletResponse response)
{

	doGet(request, response);
	
}

}
