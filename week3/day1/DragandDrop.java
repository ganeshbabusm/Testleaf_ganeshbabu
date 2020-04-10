package week3.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://leafground.com/pages/drop.html");
		driver.manage().window().maximize();

	WebElement drag = driver.findElementById("draggable");
	WebElement drop = driver.findElementById("droppable");
	
	Actions builder = new Actions (driver);
	builder.dragAndDrop(drag, drop).perform();
	
	
	String text = driver.findElementByXPath("//div[@id='droppable']/p").getText();
	System.out.println("The text changes to "+ text);
					
		
	}

}

/* This is working as expected */