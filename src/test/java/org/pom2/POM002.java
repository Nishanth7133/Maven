package org.pom2;

import java.io.IOException;

import org.maven.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.POM001;

public class POM002 extends BaseClass {
	public static void main(String[] args) throws IOException {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		title();
		POM001 P=new POM001();
		WebElement userName = P.getUserName();
		sendValue(userName, testData(1, "suman", 1, "suman"));
		WebElement password = P.getPassword();
		sendValue(password, testData(1, "suman", 1, "suman"));
		WebElement loginButton = P.getLoginButton();
		loginButton.click();
		driver.navigate().refresh();
		
		sendValue(userName, "nishanthmsundar@gmail.com");
		sendValue(password, "Nishanth@7133");
	}
}
