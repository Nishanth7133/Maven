package org.testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel {
@Test(retryAnalyzer=Failed.class)
private void testCase1() {
	System.out.println("id testcase1: "+Thread.currentThread().getId());
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
String Url = driver.getCurrentUrl();
Assert.assertTrue(Url.startsWith("www."), "check the url");
driver.findElement(By.id("email")).sendKeys("kumarking1888@gmail.com");
driver.findElement(By.id("pass")).sendKeys("kumarking@123");
driver.close();
}
@Test(retryAnalyzer=Failed.class)
private void testCase2() {
	System.out.println("id testcase2: "+Thread.currentThread().getId());
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
String Url = driver.getCurrentUrl();
Assert.assertTrue(Url.startsWith("www."), "check the url");
driver.findElement(By.id("email")).sendKeys("kumar199997@gmail.com");
driver.findElement(By.id("pass")).sendKeys("kumarking@123");
driver.close();
}
@Test(retryAnalyzer=Failed.class)
public void testCase3() {
	System.out.println("id testcase3: "+Thread.currentThread().getId());
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.id("email")).sendKeys("prasathhjvbc@gmail.com");
driver.findElement(By.id("pass")).sendKeys("kubdbking@123");
driver.close();

}
@Test(retryAnalyzer=Failed.class)
private void testCase4() {
	System.out.println("id testcase4: "+Thread.currentThread().getId());
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.id("email")).sendKeys("surya18882@gmail.com");
driver.findElement(By.id("pass")).sendKeys("kuddjbbvdking@123");
driver.close();
}
@Test(retryAnalyzer=Failed.class)
private void testCase5() {
	System.out.println("id testcase5: "+Thread.currentThread().getId());
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("https://en-gb.facebook.com/");
driver.findElement(By.id("email")).sendKeys("salvanjnf@gmail.com");
driver.findElement(By.id("pass")).sendKeys("kumarjvhdfg@123");
driver.close();
}

}

