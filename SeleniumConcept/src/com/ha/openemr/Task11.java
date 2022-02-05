package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harinis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
				driver.get("https://www.goto.com/meeting/");
				driver.findElement(By.id("truste-consent-button")).click();
				driver.findElement(By.className("go-button go-button--secondary go-button--large")).click();
				driver.findElement(By.id("first-name")).sendKeys("John");
				driver.findElement(By.id("last-name")).sendKeys("wick");
				driver.findElement(By.className("inputField__label ")).sendKeys("john@gmail.com");

				//Unable to find Job Title as “Help Desk”, so tried entering password field
				driver.findElement(By.id("login__password")).sendKeys("Help Desk");

				Select dropdown = new Select(driver.findElement(By.id("CompanySize")));
				dropdown.selectByVisibleText("10 - 99");

				//we dont have sign up button for application

	}

}
