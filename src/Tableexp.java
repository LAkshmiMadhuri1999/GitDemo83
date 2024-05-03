

	
	import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
	public class Tableexp {
	    public static void main(String[] args) throws Throwable {  
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\BMADHURI\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
//	        driver.get("https://www.w3schools.com/html/html_tables.asp");
//	        List<WebElement> totRows = driver.findElements(By.xpath("//table[@class='ws-table-all']//tr"));
//	        System.out.println("Total No of rows in the table is " +totRows.size());
//	        for(int i=1;i<totRows.size();i++)
//	        {
//	            driver.findElement(By.xpath("//table[@class='ws-table-all']//tr["+i+"]"));            
//	            List<WebElement> totCols = driver.findElements(By.xpath("//table[@class='ws-table-all']//tbody//tr["+i+"]//td"));
//	            System.out.println("Row "+i+ " Tot cols "+totCols.size());
//	            for(int j=1;j<totCols.size();j++)
//	            {
//	            	WebElement column=driver.findElement(By.xpath("//table[@class='ws-table-all']//tbody//tr["+i+"]/td["+j+"]"));
//	            	System.out.println(column.getText());
//	            }
//	        }	 
//	        driver.get("https://www.amazon.in");
//	        
//	        Select drp=new Select(driver.findElement(By.id("searchDropdownBox")));
//	        drp.selectByVisibleText("Books");
//	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry potter");
//	        driver.findElement(By.id("nav-search-submit-button")).click();
//	        driver.close();
//	        driver.get("https://demoqa.com/alerts");
//	        driver.findElement(By.id("alertButton")).click();
//	        Alert a1=driver.switchTo().alert();
//	        String text=a1.getText();
//	        System.out.println(text);
//	        a1.accept();
//	        driver.get("https://www.amazon.in");
//	        WebElement hello=driver.findElement(By.id("nav-hamburger-menu"));
//			Actions actions = new Actions(driver);
//			actions.moveToElement(hello).build().perform();
//			actions.click(hello).perform();
//	        driver.get("https://demowebshop.tricentis.com/");
//	        JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("window.scrollBy(0,250)");
//			driver.findElement(By.xpath("//a[@href='/search']")).click();
//			
//	        WebElement ele=driver.findElement(By.xpath("//a[@href='/search']"));
//	        ele.sendKeys(Keys.PAGE_DOWN);
//	        ele.click();
	        System.out.println("success");
	    }
	}