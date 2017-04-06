package com.jen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsTest {

	@Test
	public void first() {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String Heading = driver.getTitle();
		System.out.println(Heading);
		//driver.findElement(By.xpath("//input[@value='Google ಹುಡುಕಾಟ']")).click();

	}

}
