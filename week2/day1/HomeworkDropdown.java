package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeworkDropdown {

	public static void main(String[] args) {
		//Launch Browser and URL		
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();		
				driver.get("http://leafground.com/pages/Dropdown.html");
				
		//Select training program using Index				
				WebElement Firstdd = driver.findElementById("dropdown1");
				Select ddbyIndex = new Select (Firstdd);
				ddbyIndex.selectByIndex(1);
			
		//Select training program using Text
				WebElement Seconddd = driver.findElementByName("dropdown2");
				Select ddbyText = new Select (Seconddd);
				ddbyText.selectByVisibleText("Appium");
		
		//Select training program using Value
				WebElement Thirddd = driver.findElementById("dropdown3");
				Select ddbyValue = new Select (Thirddd);
				ddbyValue.selectByValue("3");
				
		//Get the number of dropdown options
				WebElement count = driver.findElementByXPath("//select[@class ='dropdown']");
				Select ddcount = new Select (count);
				List<WebElement> options = ddcount.getOptions();
				int size = options.size();
				System.out.println("Total options in the dropdown are "+size);
				
		//Use sendkeys, both will work
				
				driver.findElementByXPath("(//div[@class='example'])[5]//option[2]").click();
				//driver.findElementByXPath("(//div[@class='example'])[5]/select").sendKeys("Selenium");
				
				
		//Combobox selection 
				WebElement combo = driver.findElementByXPath("(//div[@class='example'])[6]//select");
				Select cbox = new Select(combo);
				cbox.selectByVisibleText("Selenium");
				cbox.selectByVisibleText("Appium");
				
				
				
	}

}
/* This is working as expected */