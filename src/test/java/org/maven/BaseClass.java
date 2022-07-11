package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	 public static WebDriver driver;
	public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
	public static void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	public static void closeBrowser() {
		driver.close();

	}
	public static void javaScriptExecutor(WebElement element,String value) {
		JavascriptExecutor script = (JavascriptExecutor)driver;
		
		
		

	}
	public static void title() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	public static String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		return getUrl();
	}
	
	public static void sendValue(WebElement element,String value) {
		element.sendKeys(value);
		
	}
	public static void click(WebElement element) {
		element.click();
	}
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static String attributeName (WebElement element,String name) {
		String attribute = element.getAttribute(name);
		System.out.println(attribute);
		return attribute;

	}
	public static String testData(int cellNumber, String sheetName, int rowNumber, String fileName ) throws IOException {
		File f = new File(System.getProperty("user.dir")+"\\File\\"+fileName+".xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook book = new XSSFWorkbook(fi);
		Sheet sheet = book.getSheet(sheetName);
		
		
		Row row = sheet.getRow(rowNumber);
		
			
			
				Cell cell = row.getCell(cellNumber);
				
				int cellType = cell.getCellType();
				String value="";
				if (cellType==1) {
					 value = cell.getStringCellValue();
					
					
				}
				else if (DateUtil.isCellDateFormatted(cell)) {
					Date dateCellValue = cell.getDateCellValue();
					SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
					 value = sdf.format(dateCellValue);
					
					
				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long)numericCellValue;
				 value = String.valueOf(l);
				
				}
				System.out.println(value);
		return value  ;
	}
	}

