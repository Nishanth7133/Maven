package org.test;

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

public class TestNo1 extends BaseClass {
	@DataProvider(name="logindata")
	private String[][] data() throws IOException {
		return new String[][] {
			{"kkjhbdiwhefuiahd@gmail.com","javaselenium"},
			{"ksmnho5@gmail.com","kkkhhdbwquqw"},
			{"kskjjjh@gmail.com","nishanth!"}};
	}
	@Test(dataProvider="logindata")
	public void testData1(String userName,String passWord) {
		System.out.println("id testData1 "+Thread.currentThread().getId());
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), userName);
		sendValue(p.getPassword(), passWord);
		click(p.getLoginButton());

	}
	
@BeforeMethod
private void start() {
	Date d = new Date();
	System.out.println(d);
}
@AfterMethod
private void end() {
	Date d = new Date();
	System.out.println(d);
}
@BeforeClass
private void launch() {
	launchBrowser();
}
@AfterClass
private void end1() {
	closeBrowser();
}
}
