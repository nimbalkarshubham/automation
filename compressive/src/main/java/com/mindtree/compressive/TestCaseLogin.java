package com.mindtree.compressive;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\browsers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com/");
		
		driver.findElement(By.xpath("//span[@class='header-icon-link user-profile-icon']")).click();
		driver.findElement(By.xpath("//a[@class='login-link authentication_popup']")).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_email'])[2]")).sendKeys("Shubhamnimbalkar@gmail.com");
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).click();
		driver.findElement(By.xpath("(//input[@id='spree_user_password'])[3]")).sendKeys("Shubham@54321");
		driver.findElement(By.xpath("//input[@id='ul_site_login']")).click();
		
		Thread.sleep(2000);
		driver.close();


	}

}
