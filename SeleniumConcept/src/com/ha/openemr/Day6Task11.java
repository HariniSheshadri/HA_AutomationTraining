package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6Task11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Library/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		driver.findElement(By.name("UserFirstName")).sendKeys("John");
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		driver.findElement(By.name("UserEmail")).sendKeys("john@gmail.com");
		
		Select sel1=new Select(driver.findElement(By.name("UserTitle")));
		sel1.selectByValue("IT_Manager_AP");
		
		Select sel2=new Select(driver.findElement(By.name("CompanyEmployees")));
		sel2.selectByValue("250");
		
		Select sel3=new Select(driver.findElement(By.name("CompanyCountry")));
		sel3.selectByValue("GB");
		
		//getting a popup here and not able to continue with check box and trial
		//sp try to fill COmpany data instead of clicking on tooltip- need to be a visible element to handle intercepted exception
		
		driver.findElement(By.name("CompanyName")).sendKeys("HA");
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click(); //use xpath for tooltip or can use css selector for hidden elements
		driver.findElement(By.name("UserPhone")).sendKeys("7774608238");
		driver.findElement(By.name("start my free trial")).click();

	}

}
