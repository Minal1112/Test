package utils;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class utility {

		public static void screencapture(WebDriver driver, int tcid) throws IOException {

			Date d = new Date(tcid);

			DateFormat df = new SimpleDateFormat("dd-MM-yyyy & hh-mm-ss");

			String dt = df.format(d);

			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

			File dest = new File("C:\\Users\\HP\\Downloads\\Screenshot\\Minal" + tcid +" "+ dt + ".jpg");

			FileHandler.copy(src, dest);
		}}

		
	
		
		
	