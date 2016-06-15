package com.niit.OnlineShopping.dao;

public class UserDAO {

	public boolean checkUser(String userID, String password)
	{
		if (userID.equals("NIIT") && password.equals("NIIT@123")) 
		{
			return true;	
		} 
		else 
		{
			return false;
		}

	}

	

	

}
