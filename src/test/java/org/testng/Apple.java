package org.testng;

import java.io.IOException;
import java.util.Date;

import org.maven.BaseClass;
import org.pom.POM001;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Apple extends BaseClass {
	@DataProvider(name="logindata")
	private String[][] data() throws IOException {
		return new String[][] {
			{testData(1, "suman", 1, "suman"),testData(1, "suman", 2, "suman")},
			{testData(2, "suman", 2, "suman"),testData(2, "suman", 3, "suman")},
			{testData(3, "suman", 3, "suman"),testData(3, "suman", 4, "suman")},
			{testData(4, "suman", 4, "suman"),testData(4, "suman", 5, "suman")}};
	}
	@Test(dataProvider="logindata")
	public void testData1(String userName,String passWord) {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(),userName);
		sendValue(p.getPassword(),passWord);
		click(p.getLoginButton());
	}
	
	
@BeforeMethod
private void startTime2() {
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
private void endTime2() {
	Date d = new Date();
	System.out.println(d);
}
@BeforeClass
private void launch_Browser2() {
	launchBrowser();
}
@AfterClass
private void browser_end2() {
	closeBrowser();
}}
