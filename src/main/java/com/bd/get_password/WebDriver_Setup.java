package com.bd.get_password;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriver_Setup {

	public static WebDriver driver;

	@BeforeSuite

	public static void setDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@AfterSuite
	public static void closeWindows() {

		driver.close();

	}

}
