package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class PRINT_Cell {// find last row index
	public static void main(String[] args) throws  IOException {
		FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\Excel sheet(parameterization)\\book1.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");
		int lastrowindex = sh.getLastRowNum();
		
		for( int i =0;i<=lastrowindex;i++) {
			String Data = sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println(Data);
		}
		
	}

}
