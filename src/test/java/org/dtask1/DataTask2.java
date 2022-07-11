package org.dtask1;

import java.io.IOException;

import org.maven.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class DataTask2 extends BaseClass{
public static void main(String[] args) throws IOException {
	launchBrowser();
	launchUrl("https://www.shine.com/");
	
	WebElement findElement = driver.findElement(By.xpath("//span[@class='iconWrap ml-30']"));
	WebElement findElement2 = driver.findElement(By.xpath("//button[text()='Login']"));
	findElement2.click();
	
	//sendValue(findElement, testData(2, "suman", 2, "suman"));
	//WebElement findElement1 = driver.findElement(By.id("email"));
	//sendValue(findElement1, testData(3, "suman", 2, "suman"));
	//WebElement findElement2 = driver.findElement(By.id("password"));
	//sendValue(findElement2, testData(4, "suman", 2, "suman"));
	//WebElement findElement3 = driver.findElement(By.id("mobile"));
	//sendValue(findElement3, testData(5, "suman", 2, "suman"));
	//WebElement findElement4 = driver.findElement(By.xpath("//h2[contains(text(),'a Fresher')]"));
	//click(findElement4);
	//WebElement findElement5 = driver.findElement(By.id("currentCity"));
	//sendValue(findElement5, testData(3, "suman", 3, "suman"));
	//WebElement findElement6 = driver.findElement(By.xpath("(//i[@class='ico resman-icon resman-icon-check-box'])[2]"));
	//click(findElement6);
	//WebElement findElement7 = driver.findElement(By.xpath("//button[text()='Register Now']"));
	//click(findElement7);
	
	
	
}
}
