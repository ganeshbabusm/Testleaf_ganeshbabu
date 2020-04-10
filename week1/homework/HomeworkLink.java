package week1.homework;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class HomeworkLink {

	public static void main(String[] args) throws InterruptedException {
		
		//Launch Browser and URL		
				System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();		
				driver.get("http://leafground.com/pages/Link.html");
		
		//First action to go Home Page		
				driver.findElementByLinkText("Go to Home Page").click();
				driver.findElementByXPath("//h5[text()='HyperLink']").click();
		
		//Second action to check hyperlink - used home button and then Hyperlink to get to the same page	
				String getLink = driver.findElementByLinkText("Find where am supposed to go without clicking me?").getAttribute("href");
				System.out.println("Available link for the page is "+ getLink);
				
			
		//Third action to check hyperlink - user browser back button to get to the same page
				driver.findElementByLinkText("Verify am I broken?").click();
				Thread.sleep(5000);
				String title1 = driver.getTitle();
				
		// After clicking the page, if the title has 404 that it means the link is broken
				if (title1.contains("404")) {
					System.out.println("The link is broken");					
				} else System.out.println("The link is working");
				driver.navigate().back();
		
		//Fourth action to check hyperlink
				driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
				driver.findElementByXPath("//h5[text()='HyperLink']").click();
		
		//Fifth action - Find the number of links in the page
				java.util.List<WebElement> findElementsByTagName = driver.findElementsByTagName("a");
				int size = findElementsByTagName.size();
				System.out.println(size);
				
		
		 
	}

}

/* This is working as expected */