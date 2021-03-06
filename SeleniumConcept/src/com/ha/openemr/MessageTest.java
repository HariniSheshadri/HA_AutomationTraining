package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MessageTest {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\harinis\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();//maximiz the window on lauch
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//setting implicit wait time for all find elements
		
		driver.get("https://demo.openemr.io/b/openemr");
		driver.findElement(By.id("authUser")).sendKeys("admin");
		
		driver.findElement(By.id("clearPass")).sendKeys("pass");
		
		//Create object for dropdown with select tag
		Select sel=new Select(driver.findElement(By.name("languageChoice")));
		sel.selectByVisibleText("English (Indian)");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String actualTitle=driver.getTitle();
		System.out.println(actualTitle);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
	}

}
