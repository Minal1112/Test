package Parameterization;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PRINT_Row {//print row data
	public static void main(String[] args) throws  IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\Excel sheet(parameterization)\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		short cellsize = sh.getRow(1).getLastCellNum();
		System.out.println(cellsize);
		
		for(int i=0;i<cellsize;i++) {
		
		String Data = sh.getRow(2).getCell(i).getStringCellValue();
		System.out.print(Data +" ");
	}


}}
