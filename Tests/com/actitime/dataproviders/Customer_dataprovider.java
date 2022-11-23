package com.actitime.dataproviders;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.actitime.utility.DataController;


public class Customer_dataprovider 
{

	@DataProvider(name="createcustomer")
	public Object[][] customer () throws IOException
	{
		
		return DataController.Customer_DC();
	}
	
	
	
	
}
