package com.calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {

	public static void main(String[] args) {
		  
		  System.out.println("In openBrowser method under BeforeSuite");
		  System.setProperty("webdriver.chrome.driver","E:\\Selenium data\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.path2usa.com/travel-companions");
		  System.out.println("Chrome browser is opened successfully");
		  driver.manage().window().maximize();
		  
		  driver.findElement(By.id("travel_date")).click();
		  
		  while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
		  { 
			   driver.findElement(By.cssSelector("[class='datepickerdays'[class='next']")).click();
			   
		  }
	       
		  List<WebElement> ls=driver.findElements(By.className("day"));
			int count= ls.size();
			System.out.println("The number of days are: "+count);
			
			for(int i=0;i<count;i++)
			{
				String text=driver.findElements(By.className("day")).get(i).getText();
				if(text.equalsIgnoreCase("23"))
				{
					driver.findElements(By.className("day")).get(i).click();
					break;
				}
			}
	
	}

	}
