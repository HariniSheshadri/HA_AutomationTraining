package com.ha.advance;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\harinis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
				driver.get("https://netbanking.hdfcbank.com/netbanking/");
				//using frames
				driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='login_page']")));
				
				driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("test123");
				driver.findElement(By.linkText("CONTINUE")).click();
				
				driver.switchTo().defaultContent();// comes to the main html content
	}
}
