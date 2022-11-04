package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class All_data_fetch {//fetch string data from excel
	
public static void main(String[] args) throws IOException {
				
FileInputStream file = new FileInputStream("C:\\Users\\HP\\Desktop\\Softwer Testing\\Selenium\\Excel sheet(parameterization)\\book1.xlsx");
 Sheet sh = WorkbookFactory.create(file).getSheet("sheet1");

 for(int i=0;i<=sh.getLastRowNum();i++) {
		for(int j=0;j<=sh.getRow(i).getLastCellNum()-1;j++) {
			String data = sh.getRow(i).getCell(j).getStringCellValue();
	        System.out.print(data +" ");
}
 System.out.println();
			}
			
	}}


