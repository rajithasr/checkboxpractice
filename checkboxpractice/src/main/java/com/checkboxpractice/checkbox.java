package com.checkboxpractice;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
public class checkbox {

@Test
public void check()
{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		//driver.get("https://jqueryui.com/checkboxradio");
		driver.get("https://jqueryui.com/tabs");
		driver.findElement(By.xpath("//a[text()='API Documentation']")).click();
	}	
}

	
