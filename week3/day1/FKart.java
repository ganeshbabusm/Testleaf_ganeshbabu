/* Program to click an option in FlipKart site */

package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FKart {
	public static void main(String[] args) throws InterruptedException {
		//Launch Browser and URL
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://www.flipkart.com/");
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
				driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
				
				WebElement TV = driver.findElementByXPath("//span[text()='Electronics']");
				
				Actions builder= new Actions (driver);
				
				builder.moveToElement(TV).perform(); //to mouse hover on a webelement
				Thread.sleep(3000);
				
				driver.findElementByXPath("//a[text()='Apple']").click();	
				
				}

}



/* This is working as expected */