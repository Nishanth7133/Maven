package org.maven2;

import org.maven.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;




public class Maven002 extends BaseClass {

	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		title();
		getUrl();
		WebElement findElement = driver.findElement(By.id("email"));
		sendValue(findElement, "nishanthmsundar@gmail.com");
		WebElement findElement1 = driver.findElement(By.id("pass"));
		sendValue(findElement1, "Nishanth7133");
		attributeName(findElement1, "value");
		WebElement findElement2 = driver.findElement(By.name("login"));
		getText(findElement2);
		click(findElement2);
	}

}
