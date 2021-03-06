package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task10 {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\harinis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://github.com/");
		driver.findElement(By.xpath("//a[@class='HeaderMenu-link flex-shrink-0 no-underline']")).click();
		driver.findElement(By.id("login_field")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
		driver.findElement(By.name("commit")).click();
	}
}