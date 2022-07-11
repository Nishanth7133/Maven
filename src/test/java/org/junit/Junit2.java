package org.junit;

import java.util.Date;

import org.maven.BaseClass;
import org.pom.POM001;

public class Junit2 extends BaseClass {
@BeforeClass
public static void launchbrowser() {
	launchBrowser();
}
@Before
public void startTime() {
	Date d = new Date();
	System.out.println(d);
}
@Test
public void tC1() {
	launchUrl("https://www.redbus.in/");
	POM001 p = new POM001();
	
}
}
