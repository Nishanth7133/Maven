package org.testng;

import java.io.IOException;

import java.util.Date;

import org.maven.BaseClass;
import org.pom.POM001;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Orange1 extends BaseClass {
	@Test(groups="smoke")
	private void tc001() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(1, "suman", 1, "suman"));
		sendValue(p.getPassword(), testData(1,  "suman", 2,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(invocationCount=4,priority=100,groups="regression")
	private void tc002() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(2, "suman", 1, "suman"));
		sendValue(p.getPassword(), testData(2,  "suman", 2,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(priority=-199,groups="sanity")
	public void tc003() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(3, "suman", 1, "suman"));
		sendValue(p.getPassword(), testData(3,  "suman", 2,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(groups="smoke")
	private void tc004() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(3, "suman", 4, "suman"));
		sendValue(p.getPassword(), testData(3,  "suman", 3,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(groups="smoke")
	private void tc005() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(3, "suman", 5, "suman"));
		sendValue(p.getPassword(), testData(3,  "suman", 6,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(priority=-19,groups="sanity")
	private void tc006() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(3, "suman", 7, "suman"));
		sendValue(p.getPassword(), testData(3,  "suman", 8,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(priority=1,groups="smoke")
	private void tc007() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(3, "suman", 9, "suman"));
		sendValue(p.getPassword(), testData(3,  "suman", 10,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=-1909,groups="sanity")
	private void tc008() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(3, "suman", 11, "suman"));
		sendValue(p.getPassword(), testData(3,  "suman", 12,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=1000000,groups="regression")
	private void tc009() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(4, "suman", 6, "suman"));
		sendValue(p.getPassword(), testData(4,  "suman", 7,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=-1000000,groups="regression")
	private void tc0010() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(4, "suman", 8, "suman"));
		sendValue(p.getPassword(), testData(4,  "suman", 9,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=-1,groups="sanity")
	private void tc0011() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(4, "suman", 10, "suman"));
		sendValue(p.getPassword(), testData(4,  "suman", 11,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(priority=-99,groups="regression")
	private void tc0012() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(4, "suman", 12, "suman"));
		sendValue(p.getPassword(), testData(4,  "suman", 13,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(groups="smoke")
	private void tc0013() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(5, "suman", 14, "suman"));
		sendValue(p.getPassword(), testData(5,  "suman", 15,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}
	@Test(priority=80,groups="regression")
	private void tc0014() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(5, "suman", 7, "suman"));
		sendValue(p.getPassword(), testData(5,  "suman", 8,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=-189,groups="sanity")
	private void tc0015() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(5, "suman", 9, "suman"));
		sendValue(p.getPassword(), testData(5,  "suman", 10,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=1000,groups="smoke")
	private void tc0016() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(4, "suman", 1, "suman"));
		sendValue(p.getPassword(), testData(4,  "suman", 2,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=76,groups="regression")
	private void tc0017() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(4, "suman", 3, "suman"));
		sendValue(p.getPassword(), testData(4,  "suman", 4,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=10,groups="smoke")
	private void tc0018() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(4, "suman", 5, "suman"));
		sendValue(p.getPassword(), testData(5,  "suman", 1,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=-109,groups="sanity")
	private void tc0019() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(5, "suman", 3, "suman"));
		sendValue(p.getPassword(), testData(5,  "suman", 2,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
	}@Test(priority=100,groups="smoke")
	private void tc0020() throws IOException, InterruptedException {
		launchUrl("https://en-gb.facebook.com/");
		POM001 p = new POM001();
		sendValue(p.getUserName(), testData(5, "suman", 4, "suman"));
		sendValue(p.getPassword(), testData(5,  "suman", 5,  "suman"));
		click(p.getLoginButton());
		Thread.sleep(2000);
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
@BeforeClass
private void launch_Browser() {
	launchBrowser();
}
@AfterClass
private void browser_end() {
	closeBrowser();
}
}
