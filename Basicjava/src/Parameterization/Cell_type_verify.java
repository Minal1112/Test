package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Cell_type_verify {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\Excel sheet(parameterization)\\book1.xlsx");
		  CellType CT = WorkbookFactory.create(file).getSheet("sheet1").getRow(2).getCell(3).getCellType();
		System.out.print(CT);	
		}


	}


