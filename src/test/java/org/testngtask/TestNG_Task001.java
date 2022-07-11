package org.testngtask;

import static org.testng.Assert.assertTrue;

import org.maven.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pom.POM001;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Task001 extends BaseClass {

	
	@Test
	public void facebookTask() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		findElement.sendKeys("nishanbhbs@gmail.com");
		String m = attributeName(findElement, "value");
		Assert.assertTrue(m.contains("@"), "given email is correct");
		WebElement findElement2 = driver.findElement(By.id("pass"));
		findElement2.sendKeys("9876543210");
		String n = attributeName(findElement2, "value");
		Assert.assertTrue(n.length()==10, "given pass is correct");
		WebElement findElement3 = driver.findElement(By.name("login"));
		findElement3.click();

	}
}
