package com.hybrid;

import org.testng.Assert;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.pomclasses.Loginpagepom;

public class Loginpagetest extends base {
	base b1= new base();
	Loginpagepom l1= new Loginpagepom();

	
	 @BeforeClass
   public void setup()
   {
     b1.getWebDriver();
   }
	
	/* @AfterClass
  public void teerDown()
   {
	   driver.close();
   }
    */
	@Test 
   public void testTitle()
   {
	 String str=  driver.getTitle();
	 System.out.println(str);
	 Assert.assertEquals(str, "OrangeHRM");
   }
   
   @Test
   public void adminLogin()
   {
	      
	      Loginpagepom l1= new Loginpagepom();
	      
          String username=l1.getUsername();
          String password=l1.getPassword();
          
          Assert.assertEquals(username, "Admin");
          Assert.assertEquals(password, "admin123");
          
          l1.setUsername(username);
          l1.setPassword(password);
          l1.login();
       
         
   }
}
