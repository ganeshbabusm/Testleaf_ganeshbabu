/* Program where manually pick the results */

package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Erail {

	public static void main(String[] args) {
		
		//Launch Browser and URL
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.navigate().to("https://erail.in/");
				driver.manage().window().maximize();
				
		//Add Wait and unselect checkbox
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElementByXPath("//label[text()='Sort on Date']/following::input").click();
		
		//Actions builder = new Actions(driver);
		
		//Enter From and To Stations
				driver.findElementById("txtStationFrom").clear();
				driver.findElementById("txtStationFrom").sendKeys("Chennai Egmore", Keys.TAB);
				
				driver.findElementById("txtStationTo").clear();
				driver.findElementById("txtStationTo").sendKeys("NCJ", Keys.TAB);
				
		// Manually Retreive the results
								
			String train1 = driver.findElementByXPath("//a[text()='MS GURUVAYUR EX']").getText();
			String train2 = driver.findElementByXPath("//a[text()='NAGARCOIL EXP']").getText();
			String train3 = driver.findElementByXPath("//a[text()='KANYAKUMARI EXP']").getText();
				String train4 = driver.findElementByXPath("//a[text()='THIRUKKURAL EXP']").getText();
		
		//Store in ArrayList
				List<String> trainnames = new ArrayList<String>();
				trainnames.add(train1);
				trainnames.add(train2);
				trainnames.add(train3);
				trainnames.add(train4);
		
		//Display in console the results
				
				 Collections.sort(trainnames);
					
				for (int i = 0; i < trainnames.size(); i++) {
					System.out.println(trainnames.get(i));
					
				}
		driver.close();
	}

}

