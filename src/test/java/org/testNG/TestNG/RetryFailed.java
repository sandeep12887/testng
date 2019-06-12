package org.testNG.TestNG;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer {

	
	int minCount = 0;
	int maxcount = 5;
	
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if (minCount<maxcount) {
			minCount++;
			return true;
		}
		return false;
	}
	

}
