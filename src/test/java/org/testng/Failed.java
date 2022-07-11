package org.testng;

public class Failed implements IRetryAnalyzer {
int max=2,min=0;
	public boolean retry(ITestResult arg0) {
		if (max>min) {
			min++;
			return true;
		}
		return false;
	}

}
