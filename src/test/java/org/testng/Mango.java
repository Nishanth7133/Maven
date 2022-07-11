package org.testng;

import java.io.IOException;
import java.util.Date;

import org.maven.BaseClass;
import org.pom.POM001;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Mango extends BaseClass {
	@Parameters({"userName","passWord"})
	@Test
	private void testc01(String userName, String passWord) throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		String url = getUrl();
		POM001 p = new POM001();
		
		sendValue(p.getUserName(),userName );
		sendValue(p.getPassword(),passWord );
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Parameters({"userName1","passWord1"})
	@Test
	public void testc02(String userName1,String passWord1) throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		String url = getUrl();
		
		
		POM001 p = new POM001();
		sendValue(p.getUserName(), userName1);
		sendValue(p.getPassword(),passWord1);
		click(p.getLoginButton());
		Thread.sleep(2000);
}@BeforeMethod
private void startTime() {
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
private void endTime() {
	Date d = new Date();
	System.out.println(d);
}
@BeforeClass
private void launch_Browser() {
	launchBrowser();
}
@AfterClass
private void browser_end() {
	closeBrowser();
}
}