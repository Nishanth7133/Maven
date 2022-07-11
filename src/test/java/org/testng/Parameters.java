package org.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Parameters {
@Test(groups="smoke")
private void tc1() {
	System.out.println("tc1");
}
@Test(groups="regression")
private void tc2() {
	System.out.println("tc2");
}
@Test(groups="sanity")
public void tc3() {
	System.out.println("tc3");
}
@Test(groups="smoke")
private void tc4() {
	System.out.println("tc4");
}
@Test(groups="sanity")
private void tc5() {
	System.out.println("tc5");
}
@BeforeMethod
private void timeStart() {
	System.out.println("timeStart");
}
@AfterMethod
private void endTime(){ 
System.out.println("endTime");
}
@BeforeClass
private void browser() {
	System.out.println("browserLaunch");
}
@AfterClass
private void close() {
	System.out.println("closeBrowser");

}
}
