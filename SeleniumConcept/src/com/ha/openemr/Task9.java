package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task9 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harinis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://nasscom.in/");
		driver.findElement(By.partialLinkText("New User") ).click();
		driver.findElement(By.id("edit-field-fname-reg")).sendKeys("admina");
		driver.findElement(By.id("edit-field-lname")).sendKeys("pass");
		driver.findElement(By.id("edit-mail")).sendKeys("admina@gmail.com");
		driver.findElement(By.id("edit-field-company-name-registration")).sendKeys("Google");
		
		//To select option in dropdown
		Select sel=new Select(driver.findElement(By.id("edit-field-business-focus-reg")));
		sel.selectByValue("51");
		
		driver.findElement(By.id("edit-submit--2")).click();//to check
		
		

	}

}
