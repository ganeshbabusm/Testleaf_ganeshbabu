/* Program to get the max phone price */

package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipKrtMobile {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElementByXPath("//button[@class='_2AkmmA _29YdH8']").click();
		
		WebElement TV = driver.findElementByXPath("//span[text()='Electronics']");
		
		Actions builder= new Actions (driver);
		
		builder.moveToElement(TV).perform(); //This is to mousehover
		Thread.sleep(3000);
		
		driver.findElementByXPath("//a[text()='Mi']").click();	
		
		List<WebElement> Prices = driver.findElementsByXPath("//div[@class='_1vC4OE _2rQ-NK']");
		int size = Prices.size();
		List<Integer> pricelist = new ArrayList<Integer>();
		
		for (int i = 0; i < size; i++) {
			String price = Prices.get(i).getText();
			String realprice = price.replaceAll("[^0-9]", "");
			int priceint = Integer.parseInt(realprice);
			pricelist.add(priceint);
			
		}
		System.out.println(pricelist);
		System.out.println("Maximum Phone price is "+Collections.max(pricelist));
		
		
	}

}

/* This is working as expected, but the max phone price is ONLY based on the price in the first page */