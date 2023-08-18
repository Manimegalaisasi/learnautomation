package com.baseclasssat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclassjuly29 {
public static WebDriver driver;
	
	public  static void readExcel() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
	
			File file=new File("C:\\Users\\Admin\\Desktop\\baseclass\\Book1.xlsx");
				FileInputStream stream=new FileInputStream(file);
				Workbook book=new XSSFWorkbook(stream);
				Sheet sheet = book.getSheet("Sheet1");
				Row row = sheet.getRow(1 );
				Cell cell = row.getCell(0);
				String a = cell.getStringCellValue();
				System.out.println(a); 
				
			
			
		}
	}

          		


		
		
		
	


