package org.testNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations2 {
	
	@Test
	private void test1() {
		
		Assert.fail();
	}
	
	@Test
	private void test2() {
		// TODO Auto-generated method stub
		System.out.println("Hellow");
	}
	
	
}
