package org.testNG.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations5 {
	
	
	@Test
	public void login() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rocsa_000\\eclipse-workspace\\SeleniumFirstDay\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
		WebElement findElement = driver.findElement(By.id("identifierNext"));
		System.out.println(findElement.getAttribute("value"));
		System.out.println(findElement.getAttribute("name"));
	}
	
}
