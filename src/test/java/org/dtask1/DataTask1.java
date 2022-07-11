package org.dtask1;

import java.io.IOException;

import org.maven.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DataTask1 extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchBrowser();
		launchUrl(" http://www.adactin.com/HotelApp/");
		WebElement findElement = driver.findElement(By.id("username"));
		sendValue(findElement,testData(1, "suman", 1, "suman"));
		WebElement findElement2 = driver.findElement(By.id("password"));
		sendValue(findElement2, testData(2, "suman", 2, "suman"));
		WebElement findElement3 = driver.findElement(By.id("login"));
		click(findElement3);
		getUrl();
		
		title();
}
}