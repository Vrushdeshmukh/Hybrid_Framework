package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelSheet {
	
		
		FileInputStream inputStream;
		public static String projectpath = System.getProperty("user.dir");
		
		public void readExel() throws FileNotFoundException {
			
			inputStream = new FileInputStream(projectpath+"/src/test/resources/Book1.xlsx");
		
		}
}

