package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Basic {//fetching data from single row cell 
	public static void main(String[] args) throws IOException {
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\Excel sheet(parameterization)\\book1.xlsx");
	 String info = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getCell(3).getStringCellValue();
	System.out.print(info+" ");	
	}


	
}