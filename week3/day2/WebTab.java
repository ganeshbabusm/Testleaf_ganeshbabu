/* Good Program */

package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTab {
	
public static void main(String[] args) {
	
	//Launch the browser and URL
			System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.navigate().to("http://www.leafground.com/pages/table.html");
			driver.manage().window().maximize();
			
	//Find the table		
			WebElement table = driver.findElementById("table_id");
			
	//Find all the rows and get the size of table
			List<WebElement> rows = table.findElements(By.tagName("tr"));
			int rowscount = rows.size();
			System.out.println("Number of rows in the table is "+rowscount);
			
			WebElement columns = rows.get(1);
			List<WebElement> allcolumns = columns.findElements(By.tagName("td"));
			int columncount = allcolumns.size();
			System.out.println("Number of columns in the table are "+columncount);
			
			String text = driver.findElementByXPath("//td[text()='Learn to interact with Elements']/following-sibling::td").getText();
			System.out.println("Learn to interact with Elements has the progress value of "+text);
			
			List<WebElement> findElements;
			String nopercent;
			int  intvalues;
			List<Integer> myList = new ArrayList<Integer>();
			
			
			for (int i = 1; i < rowscount; i++) {
				findElements = rows.get(i).findElements(By.tagName("td"));
				String text2 = findElements.get(1).getText();
				nopercent = text2.replaceAll("[^0-9]", "");
				//System.out.println(nopercent);
				intvalues = Integer.parseInt(nopercent);
				//System.out.println(intvalues);
				myList.add(intvalues);
												
			}
			Collections.sort(myList);
			System.out.println(myList);
			Integer minvalue = Collections.min(myList);
			System.out.println(minvalue);
			
			driver.findElementByXPath("//td[contains(text(), "+minvalue+")]/following::input").click();
			
				
			}
			
				
		
			
}	

/* This is working as expected */
