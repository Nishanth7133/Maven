package org.maven4;



import java.io.IOException;

import org.maven.BaseClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Maven4 extends BaseClass {

	public static void main(String[] args) throws IOException {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		title();
		getUrl();
		WebElement findElement = driver.findElement(By.id("email"));
		sendValue(findElement, testData(5, "suman", 3, "suman"));
		WebElement findElement1 = driver.findElement(By.id("pass"));
		sendValue(findElement1, testData(4, "suman", 8, "suman"));
		attributeName(findElement1, "value");
		WebElement findElement2 = driver.findElement(By.name("login"));
		getText(findElement2);
		click(findElement2);
	}


	}


