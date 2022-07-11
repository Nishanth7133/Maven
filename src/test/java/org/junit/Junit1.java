package org.junit;

import java.io.IOException;
import java.util.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.maven.BaseClass;

import org.pom.POM001;

public class Junit1 extends BaseClass{
@Test
public void tC1() throws IOException, InterruptedException {
	
	launchUrl("https://www.facebook.com/");
	POM001 p =new POM001();
	sendValue(p.getUserName(), testData(1, "suman", 1, "suman"));
	String attributeName = attributeName(p.getUserName(), "value");
	Assert.assertTrue("check the data", attributeName.contains("CIVIL"));
	sendValue(p.getPassword(), testData(2, "suman", 2, "suman"));
	String attributeName2 = attributeName(p.getPassword(), "value");
	Assert.assertEquals("check the given data", 10, attributeName2.length());
	click(p.getLoginButton());
	Thread.sleep(2000);
}

@Ignore
@Test
public void tC2() throws IOException, InterruptedException {
	launchUrl("https://en-gb.facebook.com/");
	POM001 p =new POM001();
	sendValue(p.getUserName(), testData(2, "suman", 1, "suman"));
	sendValue(p.getPassword(), testData(3, "suman", 2, "suman"));
	click(p.getLoginButton());
	Thread.sleep(2000);
}
@Test
public void tC3() throws IOException, InterruptedException {
	launchUrl("https://en-gb.facebook.com/");
	POM001 p =new POM001();
	sendValue(p.getUserName(), testData(3, "suman", 1, "suman"));
	sendValue(p.getPassword(), testData(4, "suman", 2, "suman"));
	click(p.getLoginButton());
	Thread.sleep(2000);
}
@Before
public void startTime() {
	Date d = new Date();
	System.out.println(d);
}
@After
public void endTime() {
	Date d = new Date();
	System.out.println(d);
}
@BeforeClass
public static void launch_Browser() {
	launchBrowser();
}
@AfterClass
public static void close_Browser() {
	closeBrowser();

}

}

