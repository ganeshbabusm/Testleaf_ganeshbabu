/* Program to sort all the train names */

package week3.day2;

import java.util.ArrayList;
import java.util.Collections;

/* This program is used to sort the train names */

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class erail3 {

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

	// Find the table
			WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
			
	// Find all the table rows and get row count
			
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			int rowcount = rows.size();
			System.out.println(rowcount);
			
			String trainname;
			List<String> sortedtrainlist = new ArrayList<String>();
			
			
			for (int i = 0; i < rowcount; i++) {
				WebElement eachrow = rows.get(i); // Assigns the row data
				//System.out.println(eachrow.getText()); - This will print the entire table
				List<WebElement> columns = eachrow.findElements(By.tagName("td"));
				trainname = columns.get(1).getText();
				//System.out.println(trainname);
				sortedtrainlist.add(trainname);
			    			
	}

			Collections.sort(sortedtrainlist);
			//System.out.println(sortedtrainlist);
			
			for (String element : sortedtrainlist) {
			    System.out.println(element);
			}
}
}

/* This is working as expected */