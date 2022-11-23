package com.actitime.customer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.base.WebBase;
import com.actitime.dataproviders.Customer_dataprovider;
import com.actitime.pagefactory.EnterTimeTrack_page;
import com.actitime.pagefactory.Task_page;
import com.actititime.utility.CaptureScreens;
import com.actititime.utility.Logreport;
import com.actititime.utility.Waitstatements;



public class Createcustomer  extends WebBase
{

	@Test(dataProvider ="createcustomer" ,dataProviderClass = Customer_dataprovider.class)
	
	void createcustomer(String customer_name,String customer_description) throws IOException
	{
		System.out.println("create customer");	
	
	}
	
	
	
	
	
	
	
}
