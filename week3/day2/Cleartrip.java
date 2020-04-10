package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cleartrip {

	public static void main(String[] args) throws InterruptedException {
		//Launch Browser and URL
					System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
					ChromeDriver driver = new ChromeDriver();
					driver.navigate().to("https://www.cleartrip.com/");
					driver.manage().window().maximize();
		
					
		//Add Waittime
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					
		/*
		 * String alert1 = driver.switchTo().alert().getText();
		 * System.out.println(alert1); driver.switchTo().alert().accept();
		 */
					
					
					driver.findElementById("RoundTrip").click();
					
					driver.findElementByXPath("//input[@name='origin']").sendKeys("Chennai", Keys.TAB);
					driver.findElementByXPath("//input[@name='destination']").sendKeys("New York", Keys.TAB);
					
					driver.findElement(By.id("DepartDate")).sendKeys("Thu, 18 Jun, 2020",Keys.TAB);
					
					driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 24 Jul, 2020",Keys.TAB);
					
		//Select Adults, Childs and Infant
					WebElement dd1 = driver.findElementById("Adults");
					Select ad = new Select(dd1);
					ad.selectByValue("2");
					
					WebElement dd2 = driver.findElementById("Childrens");
					Select chi = new Select(dd2);
					chi.selectByValue("1");
					
					WebElement dd3 = driver.findElementById("Infants");
					Select inf = new Select(dd3);
					inf.selectByValue("1");
					
		//Add more options prior to submit
					
					driver.findElementById("MoreOptionsLink").click();
					
					WebElement dd4 = driver.findElementById("Class");
					Select travel = new Select(dd4);
					travel.selectByVisibleText("Premium Economy");
					Thread.sleep(3000);
					
					driver.findElementByXPath("//input[@name='airline']").sendKeys("EMIRATES", Keys.TAB);
					Thread.sleep(3000);
					
					driver.findElementById("SearchBtn").click();
					
					
									
	}

}


/* This is working as expected */