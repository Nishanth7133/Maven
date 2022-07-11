package org.testngtask;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.maven.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Task002 extends BaseClass{

	@Test
	public void facebookTask() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		WebElement findElement = driver.findElement(By.id("src"));
		findElement.sendKeys("Chennai");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String m = attributeName(findElement, "value");
		Assert.assertTrue(m.contains("C"), "given email is correct");
		WebElement findElement2 = driver.findElement(By.id("dest"));
		findElement2.sendKeys("Jedarpalayam(Tamil Nadu)");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String n = attributeName(findElement2, "value");
		Assert.assertTrue(n.contains("palayam"), "given pass is correct");
		WebElement findElement3 = driver.findElement(By.id("onward_cal"));
		findElement3.click();
		WebElement findElement4 = driver.findElement(By.xpath("//td[text()='29']"));
		findElement4.click();
		WebElement findElement5 = driver.findElement(By.id("search_btn"));
		findElement5.click();
		

	}
}
