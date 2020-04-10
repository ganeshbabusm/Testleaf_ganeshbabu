package week3.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Program to get the list of all train names */

public class erail2 {
	
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
		
		// Find the Columns count
		WebElement firstrow = rows.get(0);
		List<WebElement> allcolumn = firstrow.findElements(By.tagName("td"));
		int csize = allcolumn.size();
		System.out.println(csize);
	
		WebElement columnname = allcolumn.get(1);
		
		String trainname = columnname.getText();
		System.out.println(trainname);
		
		
		
		
		}
		
		
		
		
		
		
			
		}
		
		
	/* This is working as expected */	
		
	
	

