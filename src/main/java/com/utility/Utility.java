package com.utility;

import java.time.Duration;

import org.openqa.selenium.WebElement;

import com.hybrid.base;

public class Utility  extends base{
	
	

		public static void setText(String text,WebElement ele) {
			ele.sendKeys(text);
		}
		
		public static void elementClick(WebElement ele) {
			ele.click();
		}
		
		public static void setImplicitWait(int sec) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		}
	

}
