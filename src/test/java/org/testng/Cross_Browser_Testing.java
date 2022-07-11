package org.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross_Browser_Testing {

	@Parameters({"browserName"})
	@Test
	
	public void cross_Testing(String browserName) {
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://en-gb.facebook.com/");	
		}
		else if (browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			
		}
		else if (browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
		}

	}
}
