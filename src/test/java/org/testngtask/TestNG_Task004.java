package org.testngtask;

import java.util.Date;

import org.maven.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_Task004 extends BaseClass {
@DataProvider(name="Authentication")
private String[][] datProvider() {
	return new String[][] {
		{"nishanthmsundar@gmail.com","9876543210"},
		{"nishanth7133@gmail.com","8765432109"},
		{"dharanirajesh@gmail.com","7654321098"}
		};
}
@Test(dataProvider="Authentication")
public void dataProvider(String userName, String passWord) {
	launchUrl("https://mail.google.com/");
	WebElement findElement = driver.findElement(By.id("identifierId"));
	findElement.sendKeys(userName);
	WebElement findElement1 = driver.findElement(By.xpath("//span[text()='Next']"));
	findElement1.click();;
	
}
@BeforeClass
private void launch() {
	launchBrowser();
}
@AfterClass
private void end1() {
	closeBrowser();
}

@BeforeMethod
private void startTime() {
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
private void endTime() {
	Date d = new Date();
	System.out.println(d);
}
}
