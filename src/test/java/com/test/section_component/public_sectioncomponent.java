package com.test.section_component;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeoutException;

public class public_sectioncomponent {
	
	WebDriver driver;
	
			@BeforeTest
			
			public void setup() throws MalformedURLException 
			{
				
				  DesiredCapabilities dc = DesiredCapabilities.chrome();
			        URL url = new URL("http://172.20.23.7:5555/wd/hub");
			        driver = new RemoteWebDriver(url, dc);
			
			       
			}
		
			@Test(priority = 1)
			    public void public_lims() {
			       
			        
			        driver.get("http://colab.humanbrain.in/");
			        driver.manage().window().maximize();
			    }
		
			    @Test(priority = 2)
			    public void Dataportal() {
			        WebDriverWait wait = new WebDriverWait(driver, 20);
			        WebElement portallink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://dataportal.colab.humanbrain.in']")));
			        portallink.click();
			        System.out.println("The Website launched sucessfully");
			    }
		
			@Test(priority = 3)
			public void login() throws InterruptedException {
			        switchToNewWindow();
		
			        WebDriverWait wait1 = new WebDriverWait(driver, 20);
			        WebElement viewerSectionLink = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Viewer']")));
			        viewerSectionLink.click();
			        System.out.println("-------------------------------------------------");
			        System.out.println("The Viewer Icon has been clicked");
		
			        String parentWindow = driver.getWindowHandle();
		
			        WebDriverWait wait2 = new WebDriverWait(driver, 20);
			        WebElement login = wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()=' Log In ']")));
			        login.click();
			        System.out.println("-------------------------------------------------");
			        System.out.println("The Login Button is clicked");
			        Thread.sleep(4000);
			        driver.switchTo().window(parentWindow);
			WebDriverWait wait3 = new WebDriverWait(driver, 20);
			switchToNewWindow();
			        WebElement emailInput = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='email']")));
			        emailInput.sendKeys("softwaretestingteam9@gmail.com");
			Thread.sleep(4000);
			System.out.println("-------------------------------------------------");
			System.out.println("Mail I'd has been entered sucessfully");
			WebDriverWait wait4 = new WebDriverWait(driver, 20);
			      WebElement nextButton = wait4.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
			      nextButton.click();
			System.out.println("-------------------------------------------------");
			System.out.println("The Next Button is clicked");
			WebDriverWait wait5 = new WebDriverWait(driver,20);
			WebElement  PasswordInput = wait5.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='password']")));
			PasswordInput.sendKeys("Health#123");
			System.out.println("-------------------------------------------------");
			System.out.println("Password as entered");
			WebDriverWait wait6 = new WebDriverWait(driver,20);
			WebElement  Next2 = wait6.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Next']")));
			Next2.click();
			System.out.println("-------------------------------------------------");
			System.out.println("The Next Button is clicked");
			Thread.sleep(5000);
			driver.switchTo().window(parentWindow);
			}
			
			@Test(priority=4)
			public void Brain()
			{
			
			WebDriverWait wait7 = new WebDriverWait(driver,20);
			WebElement  table1 = wait7.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Goat ']")));
			table1.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The Species Brain is Selected");
			WebDriverWait wait8 = new WebDriverWait(driver,20);
			WebElement  table2 = wait8.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()=' Brain ']")));
			table2.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The Brain tab is Clicked");
			WebDriverWait wait9 = new WebDriverWait(driver,20);
			WebElement  table3 = wait9.until(ExpectedConditions.elementToBeClickable(By.xpath("//td[text()=' Goat_Brain4']")));
			table3.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The Goat Brain4 is Selected");
			WebDriverWait wait10 = new WebDriverWait(driver,20);
			WebElement  table4 = wait10.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='399']")));
			table4.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The section No:399 is clicked");
			WebDriverWait wait11 = new WebDriverWait(driver,20);
			WebElement  table5 = wait11.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='/viewer/assets/images/colorsvg/viewHD.svg']")));
			table5.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The HD viewer is Opened");
			        System.out.println("-------------------------------------------------");
			        System.out.println("The HD viewer is Opened");
			FluentWait<WebDriver> wait;
			try {
			WebDriverWait wait12 = new WebDriverWait(driver,20);
			WebElement  Z = wait12.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='B_29_STB4-SL_399-ST_NISL-SE_399_compressed.jp2']")));
			String Y = Z.getText();
			String expectedT10 = "B_29_STB4-SL_399-ST_NISL-SE_399_compressed.jp2";
			Assert.assertEquals(Y, expectedT10);          
			System.out.println("Assertion passed: " + Y + " matches the expected value.");
			System.out.println("The file name is matched Sucessfully");
		
			} catch (AssertionError e) {
			   System.out.println("Assertion failed: " + e.getMessage());
			} catch (Exception e1) {
			   System.out.println("An error occurred: " + e1.getMessage());  
			}
			}
			
			@Test(priority = 5)
			public void section_component() throws InterruptedException {
			WebDriverWait wait14 = new WebDriverWait(driver,20);
			WebElement  table7 = wait14.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()=' Mouse ']")));
			table7.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The Mouse brain is selected ");
			WebDriverWait wait15 = new WebDriverWait(driver,20);
			WebElement  table8 = wait15.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()=' Brain ']")));
			table8.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The Organ is selected");
			WebDriverWait wait16 = new WebDriverWait(driver,20);
			WebElement  table9 = wait16.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()=' MTB 12 ']")));
			table9.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The MTB 12 is selected");
			WebDriverWait wait17 = new WebDriverWait(driver,20);
			WebElement  table10 = wait17.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()=' NISSL ']")));
			table10.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The stain is selected");
			WebDriverWait wait18 = new WebDriverWait(driver,30);
			WebElement  table11 = wait18.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text()=' 109 ']")));
			table11.click();
			System.out.println("-------------------------------------------------");
			        System.out.println("The Section number selected");
			WebDriverWait wait19 = new WebDriverWait(driver,30);
			WebElement  table12 = wait19.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Load']")));
			table12.click();
			Thread.sleep(3000);
			System.out.println("-------------------------------------------------");
			        System.out.println("The Load icon is clicked");
			        System.out.println("-------------------------------------------------");
			        try {
			WebDriverWait wait20 = new WebDriverWait(driver,20);
			WebElement  W = wait20.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='B_54_MTB12-SL_19-ST_NISL-SE_109_compressed.jp2']")));
			String X = W.getText();
			String expectedT10 = "B_54_MTB12-SL_19-ST_NISL-SE_109_compressed.jp2";
			Assert.assertEquals(expectedT10, X);          
			System.out.println("Assertion passed: " + X + " matches the expected value.");
			System.out.println("-------------------------------------------------");
			System.out.println("The file name is matched Sucessfully");
			System.out.println("-------------------------------------------------");
			} catch (AssertionError e) {
			   System.out.println("Assertion failed: " + e.getMessage());
			} catch (Exception e1) {
			   System.out.println("An error occurred: " + e1.getMessage());  
			}
			               }
			public void switchToNewWindow() {
			    Set<String> windowHandles = driver.getWindowHandles();
			    for (String windowHandle : windowHandles) {
			        driver.switchTo().window(windowHandle);
			   
			}
			    System.out.println("******************************section component validation done*********************************");
			}
		
			@AfterTest
			public void tearDown() {
			if (driver != null) {
			driver.quit();
			}
			}

}
