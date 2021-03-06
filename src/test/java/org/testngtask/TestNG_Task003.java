package org.testngtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Task003 {
	@Parameters({"browserName"})
	@Test
public void crossBrowser(String browserName) {
	
	if (browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com");
	}
	else if (browserName.equals("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.greenstechnologys.com");
	}
	else if (browserName.equals("ie")) {
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://www.greenstechnologys.com");
	}

}
}