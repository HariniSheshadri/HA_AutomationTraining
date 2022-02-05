package com.ha.openemr;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day6Task12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Library/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://demo.openemr.io/b/openemr/");
		driver.findElement(By.xpath("//input[@id=\"authUser\"]")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id=\"clearPass\"]")).sendKeys("pass");
		
		Select sel1=new Select(driver.findElement(By.name("languageChoice")));
		sel1.selectByValue("18");
		
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		
		
		//to be continued  (to retry the below part which uses frames)
		driver.findElement(By.xpath("//span[@class='tabTitle tabHidden']")).click();
		driver.switchTo().frame(driver.findElement(By.name("msg")));
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-add']")).click();
		driver.findElement(By.id("note")).sendKeys("hello");
		Select drop = new Select(driver.findElement(By.id("form_note_type")));
		drop.selectByVisibleText("Pharmacy");
		Select drop1 = new Select(driver.findElement(By.name("form_message_status")));
		drop1.selectByVisibleText("New");
		Select drop2 = new Select(driver.findElement(By.id("users")));
		drop2.selectByVisibleText("Jarvis, Fred");
		driver.findElement(By.id("newnote")).click();
		}


		
		

	}


