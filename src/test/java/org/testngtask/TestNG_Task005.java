package org.testngtask;

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

public class TestNG_Task005 extends BaseClass {
@Test(groups="smoke",priority=100)
public void userName() throws IOException {
	launchUrl("https://en-gb.facebook.com/");
	POM001 p = new POM001();
	sendValue(p.getUserName(), testData(5, "suman", 14, "suman"));
	sendValue(p.getPassword(), testData(5,  "suman", 15,  "suman"));
	click(p.getLoginButton());

}
@Test(groups="sanity",priority=10)
private void passWord() throws IOException {
	launchUrl("https://en-gb.facebook.com/");
	POM001 p = new POM001();
	sendValue(p.getUserName(),"nishanth@gmail.com" );
	sendValue(p.getPassword(),"9876543210" );
	click(p.getLoginButton());

}
@DataProvider(name="testing")
private String[][] testing() {
	return new String[][] {
		{"nishanth123@gmail.com","8765432109"}};
}
@Test(dataProvider="testing",groups="regression",priority=1000)
private void click(String userName,String password) {
	launchUrl("https://en-gb.facebook.com/");
	POM001 p = new POM001();
	sendValue(p.getUserName(),userName );
	sendValue(p.getPassword(), password);
	click(p.getLoginButton());
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
