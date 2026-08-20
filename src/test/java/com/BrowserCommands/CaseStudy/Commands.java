package com.BrowserCommands.CaseStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands {

	@Test
	public void Hiox() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.login.hiox.com/register?referrer=easycalculation.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());

		driver.quit();
	}

	@Test
	public void EasyCalculation() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.easycalculation.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("googleSearchId")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//*[@id=\"cse-search-box\"]/span[2]/button")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		System.out.println(driver.getPageSource().length());
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("link count " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		driver.quit();
	}

	@Test
	public void Webkul() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://store.webkul.com");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("link count " + links.size());

		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	
	@Test
	public void AutomationPractice() {
		ChromeDriver driver = new ChromeDriver();

        String expectedUrl = "http://automationpractice.com/index.php";
        driver.get(expectedUrl);
        String title = driver.getTitle();

        System.out.println("Page Title: " + title);
        System.out.println("Title Length: " + title.length());

        String actualUrl = driver.getCurrentUrl();

        System.out.println("Current URL: " + actualUrl);


        if(expectedUrl.equals(actualUrl))
        	System.out.println("URL verification successful");
        else
        	System.out.println("Not a desired URL");

        String pageSource = driver.getPageSource();
        System.out.println("Page Source Length: " + pageSource.length());

        List<WebElement> links = driver.findElements(By.tagName("a"));
        
		for (WebElement link : links) {
			System.out.println(link.getAttribute("href"));
		}
		System.out.println(driver.getTitle());
		driver.quit();
	}
	
	

}