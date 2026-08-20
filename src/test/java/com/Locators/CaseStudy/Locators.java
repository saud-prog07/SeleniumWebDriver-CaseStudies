package com.Locators.CaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {
	
	@Test
	public void LocatorsPracticalDemo() throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/index.php");
		driver.manage().window().maximize();
		
			
		//clicking on age-calculator
		driver.findElement(By.xpath("//*[@id=\"alarmContentDisplay\"]/div[1]/div[6]/div[2]/div[1]/ul[1]/li[1]/a")).click();
		Thread.sleep(10000);
	   	//getting the images and links
	   List<WebElement> links = driver.findElements(By.tagName("a"));
	   List<WebElement> images = driver.findElements(By.tagName("img"));
	   
	   System.out.println("No of Links: " + links.size());
	   System.out.println("No of Images: " + images.size());
	   
	   //printing only 10 links and 5 images
	   for(int i=0; i<10; i++) {
		   System.out.println(links.get(i).getAttribute("href"));
	   }
	   
	   for(int i=0; i<5; i++) {
		   System.out.println(images.get(i).getAttribute("src"));
	   }
	   
	   //input DOB
	   driver.findElement(By.xpath("//*[@id=\"i21\"]")).sendKeys("23");
	   driver.findElement(By.xpath("//*[@id=\"i22\"]")).sendKeys("10");
	   driver.findElement(By.xpath("//*[@id=\"i23\"]")).sendKeys("2005");
	  
	   //click on generate
	   driver.findElement(By.xpath("//input[@name='but']")).click();
	
	   String age = driver.findElement(By.xpath("//input[@id='r1']")).getAttribute("value");
	   String days = driver.findElement(By.xpath("//input[@id='r4']")).getAttribute("value");
	   String hours = driver.findElement(By.xpath("//input[@id='r3']")).getAttribute("value");
	   String minutes = driver.findElement(By.xpath("//input[@id='r2']")).getAttribute("value");
	   System.out.println("your age is: " + age);
	   System.out.println("your age in days: " + days);
	   System.out.println("your age in hours: " + hours);
	   System.out.println("your age minutes: " + minutes);
	   
	   Thread.sleep(5000);
	   //click on refresh
	   driver.findElement(By.xpath("//input[@onclick='clearall()']")).click();
	}
}